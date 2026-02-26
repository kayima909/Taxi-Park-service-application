# 🚖 TaxiPark Service Application

A RESTful API built with **Spring Boot** that manages taxi park operations including car types, route numbers, and schedules.

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (file-based)
- **Lombok**
- **Maven**

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/taxipark/
│   │       ├── controller/
│   │       │   └── TaxiParkController.java
│   │       ├── service/
│   │       │   └── TaxiParkService.java
│   │       ├── repository/
│   │       │   └── TaxiParkRepository.java
│   │       ├── entity/
│   │       │   └── TaxiPark.java
│   │       └── TaxiParkApplication.java
│   └── resources/
│       └── application.properties
```

---

## ⚙️ Getting Started

### Prerequisites
- Java 17 or higher installed
- Maven installed
- IntelliJ IDEA or any Java IDE

### Installation

**1. Clone the repository**
```bash
git clone https://github.com/kayima909/Taxi-Park-service-application.git
```

**2. Navigate into the project**
```bash
cd Taxi-Park-service-application
```

**3. Run the application**
```bash
./mvnw spring-boot:run
```

**4. The app will start on:**
```
http://localhost:8080
```

---

## 🗄️ Database

This application uses **H2 file-based database** — no installation required. The database file is automatically created in the `/data` folder when the app starts.

To access the H2 console:
```
http://localhost:8080/h2-console
```
- **JDBC URL:** `jdbc:h2:file:./data/taxiPark_db`
- **Username:** `David`
- **Password:** `Kayima/9`

---

## 📡 API Endpoints

Base URL: `http://localhost:8080/taxiPark`

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/taxiPark` | Create a new taxi park entry |
| `GET` | `/taxiPark` | Get all taxi park entries |
| `GET` | `/taxiPark/{id}` | Get a taxi park entry by ID |
| `PUT` | `/taxiPark/{id}` | Update a taxi park entry |
| `DELETE` | `/taxiPark/{id}` | Delete a taxi park entry |

---

## 📝 Sample Request

### Create a TaxiPark Entry
**POST** `/taxiPark`

**Request Body:**
```json
{
    "carType": "Toyota Hilux",
    "routeNumbers": 3,
    "dayOfTheWeek": "Monday",
    "startTime": "08:00",
    "endTime": "18:00"
}
```

**Response (201 Created):**
```json
{
    "id": 1,
    "carType": "Toyota Hilux",
    "routeNumbers": 3,
    "dayOfTheWeek": "Monday",
    "startTime": "08:00",
    "endTime": "18:00"
}
```

---

### Get All TaxiParks
**GET** `/taxiPark`

**Response (200 OK):**
```json
[
    {
        "id": 1,
        "carType": "Toyota Hilux",
        "routeNumbers": 3,
        "dayOfTheWeek": "Monday",
        "startTime": "08:00",
        "endTime": "18:00"
    },
    {
        "id": 2,
        "carType": "Coaster",
        "routeNumbers": 7,
        "dayOfTheWeek": "Tuesday",
        "startTime": "07:00",
        "endTime": "17:00"
    }
]
```

---

## 👨‍💻 Author

**David Kayima**
- GitHub: [@kayima909](https://github.com/kayima909)
- Location: Kampala Uganda 🇺🇬

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).