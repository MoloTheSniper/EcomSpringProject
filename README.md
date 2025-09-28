# E-Commerce Project

A full-stack e-commerce application with **Spring Boot (Java)** backend and **React + Vite** frontend.

---

## 🧰 Technologies Used

* **Backend**: Java, Spring Boot, Maven/Gradle, H2 Database, Lombok
* **Frontend**: React, Vite, Bootstrap, Axios
* **Build Tools**: Maven/Gradle (backend), npm (frontend)

---

## 🚀 Getting Started

### Prerequisites

* Java 21
* Maven (backend)
* Node.js 18+ and npm (frontend)
* IntelliJ IDEA (recommended for backend development)

---

### Backend Setup (Spring Boot)

1. **Clone the repository**

```bash
git clone <your-repo-url>
cd ecom-proj/backend
```

2. **Set JDK in IntelliJ**

* **File → Project Structure → Project**

  * Project SDK: 17 (or 21)
  * Language level: match SDK
* **Modules → Dependencies → Module SDK**: same SDK

3. **Run the backend**

```bash
# Maven
./mvnw spring-boot:run

# Gradle
./gradlew bootRun
```

* Backend runs at: `http://localhost:8080`

4. **Access H2 database console**

* Enable H2 console in `application.properties`:

```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

* Open: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:moloko`
* User: `sa`
* Password: leave blank

5. **API Endpoints**

| Method | Endpoint                      | Description                                                 |
| ------ | ----------------------------- | ----------------------------------------------------------- |
| GET    | /api/products                 | Get all products                                            |
| GET    | /api/product/{id}             | Get product by ID                                           |
| POST   | /api/product                  | Add product (multipart/form-data: product JSON + imageFile) |
| PUT    | /api/product/{id}             | Update product (multipart/form-data)                        |
| DELETE | /api/product/{id}             | Delete product by ID                                        |
| GET    | /api/product/{id}/image       | Get product image                                           |
| GET    | /api/products/search?keyword= | Search products                                             |

---

### Frontend Setup (React + Vite)

1. **Navigate to frontend folder**

```bash
cd ../src
```

2. **Install dependencies**

```bash
npm install
```

3. **Run development server**

```bash
npm run dev
```

* Open browser: `http://localhost:5173/`
---

## ⚡ Notes

* Lombok is used in backend models. Avoid manually duplicating constructors if using `@AllArgsConstructor`.
* Backend uses **in-memory H2 database** by default. To persist data, change URL to:

```properties
spring.datasource.url=jdbc:h2:file:./data/moloko
```

* Frontend API requests should point to: `http://localhost:8080/api/...`

---

## 📌 Recommended Tools

* IntelliJ IDEA (ARM64 for M1/M2 Mac)
* Postman or curl for testing backend endpoints
* Node.js and npm for frontend
