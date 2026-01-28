# 💱 Real-Time Currency Converter (Java + Spring Boot)

A real-time currency converter application where the frontend is used only for UI/design
and all business logic is handled in the Java Spring Boot backend.

This project follows industry-standard backend architecture and supports 160+ global
currencies using a real-time exchange rate API.

--------------------------------------------------

## 🚀 Features

- Real-time currency conversion
- Supports 160+ global currencies
- All logic handled in backend (Java)
- Frontend used only for UI/design
- Live exchange rates from external API
- Clean and responsive UI
- Error handling and validation

--------------------------------------------------

## 🏗️ Architecture

Frontend (HTML / CSS / JavaScript)
        |
        |  HTTP REST API
        |
Backend (Java + Spring Boot)
        |
        |  Real-Time Exchange Rate API
        |
External Currency API

--------------------------------------------------

## 🧩 Tech Stack

### Frontend
- HTML
- CSS
- JavaScript

### Backend
- Java 17
- Spring Boot
- Spring Web (REST API)
- Maven

### External API
- ExchangeRate-API (supports 160+ currencies)

--------------------------------------------------

## ⚙️ How It Works

1. User enters the amount and selects currencies in the UI
2. Frontend sends a request to the backend REST API
3. Backend fetches real-time exchange rates
4. Conversion logic runs in the Java service layer
5. Result is returned and displayed in the UI

--------------------------------------------------

## ▶️ How to Run the Project

### Backend
mvn spring-boot:run

### Frontend
Open in browser:
http://localhost:8080/index.html

--------------------------------------------------

## 🔍 Example API Call

Request:
GET /api/convert?from=USD&to=INR&amount=1000

Response:
91650.23

--------------------------------------------------

## 📌 Future Enhancements

- Currency symbols and country flags
- Searchable dropdown
- Dark mode UI
- Exchange rate caching
- Cloud deployment (AWS / Azure / GCP)

--------------------------------------------------

## 👤 Author

Md Aadil  
Java Backend Developer  

Skills:
Java | Spring Boot | REST APIs | Backend Architecture | Real-Time Applications
