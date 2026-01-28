package Currency.Convertor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CurrencyService {
    private static final String RATE_API =
            "https://api.exchangerate-api.com/v4/latest/{base}";

    private static final String CURRENCY_API =
            "https://api.exchangerate-api.com/v4/latest/USD";

    private final RestTemplate restTemplate = new RestTemplate();

    public double convert(String from, String to, double amount) {

        from = from.trim().toUpperCase();
        to = to.trim().toUpperCase();

        Map<String, Object> response =
                restTemplate.getForObject(RATE_API, Map.class, from);

        if (response == null || !response.containsKey("rates")) {
            throw new RuntimeException("Failed to fetch live exchange rate");
        }

        Map<String, Object> rates =
                (Map<String, Object>) response.get("rates");

        if (!rates.containsKey(to)) {
            throw new RuntimeException("Unsupported currency");
        }

        Number rate = (Number) rates.get(to);
        return amount * rate.doubleValue();
    }
    public Map<String, Object> getAllCurrencies() {
        Map<String, Object> response =
                restTemplate.getForObject(CURRENCY_API, Map.class);

        return (Map<String, Object>) response.get("rates");
    }
}
