window.onload = loadCurrencies;

function loadCurrencies() {
    fetch("http://localhost:8080/api/currencies")
        .then(res => res.json())
        .then(data => {
            const from = document.getElementById("from");
            const to = document.getElementById("to");

            Object.keys(data).forEach(code => {
                from.add(new Option(code, code));
                to.add(new Option(code, code));
            });

            from.value = "USD";
            to.value = "INR";
        });
}

function convert() {
    const amount = document.getElementById("amount").value;
    const from = document.getElementById("from").value;
    const to = document.getElementById("to").value;

    if (!amount || amount <= 0) {
        document.getElementById("result").innerText =
            "Enter a valid amount";
        return;
    }

    fetch(`http://localhost:8080/api/convert?from=${from}&to=${to}&amount=${amount}`)
        .then(res => res.text())
        .then(data => {
            const formatted = Number(data).toLocaleString("en-IN", {
                maximumFractionDigits: 2
            });

            document.getElementById("result").innerText =
                "Converted Amount: " + formatted;
        });
}
