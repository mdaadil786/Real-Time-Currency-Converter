package Currency.Convertor.controller;

import Currency.Convertor.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CurrencyController {
    private final CurrencyService service;

    public CurrencyController(CurrencyService service) {
        this.service = service;
    }

    @GetMapping("/convert")
    public ResponseEntity<?> convert(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam double amount) {

        try {
            return ResponseEntity.ok(
                    service.convert(from, to, amount)
            );
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(e.getMessage());
        }
    }
    @GetMapping("/currencies")
    public Map<String, Object> getCurrencies() {
        return service.getAllCurrencies();
    }
}
