# 🚖 Uber Review Services

![Profile Views](https://visitor-badge.laobi.icu/badge?page_id=monudhakad1.uber_review_service)


A Spring Boot microservice for managing ride reviews in an Uber-like application.

---

## 📌 Features

- Add, update, delete, and view reviews for rides.
- Connect reviews with bookings, drivers, and passengers.
- Use DTOs and Adapters for clean code structure.
- Manage booking statuses (Scheduled, Cancelled, Cab Arrived, Assigning Driver, In Ride, Completed).

---

## ⚙️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (or any RDBMS)
- **Gradle**
- **Postman (Testing )**

---

## 📁 Project Structure

```

uber\_review\_services/
├── src/main/java/org/example/uberreviewservices/
│   ├── models/
│   │   ├── BaseModel.java
│   │   ├── Booking.java
│   │   ├── BookingStatus.java
│   │   ├── Review.java
│   │   ├── BookingStatus.java
│   │   ├── Driver.java
│   │   ├── Passenger.java
│   │   ├── PassengerReview.java
│   ├── dto/
│   │   ├── CreateReviewDto.java
|   |   ├── ReviewDto
│   ├── Adapters/
│   │   ├── CreateReviewDtoToReviewAdapter.java
│   │   ├── CreateReviewDtoToReviewAdapterImpl.java
│   ├── Repositories/
│   │   ├── BookingRepository.java
│   │   ├── ReviewRepository.java
│   │   ├── DriverRepositroy.java
│   ├── Services/
│   │   ├── ReviewService.java
│   │   ├── ReviewServiceImpl.java
│   ├── Controllers/
│   │   ├── ReviewController.java
├── src/main/resources/
│   ├── application.properties

````

---

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/monudhakad1/uber_review_service.git
    ``

2. **Navigate to the project**
   ```bash
   cd uber_review_service
``


3. **Configure your database**
a
   Open `src/main/resources/application.properties` and set:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/uber_db_local
   spring.datasource.username=root
   spring.datasource.password=enterthepasswordhere
   spring.jpa.hibernate.ddl-auto=update
   ````

4. **Run the application**

   ```bash

   ./gradlew bootrun

   ````

   Or use your IDE to run the `main` class.

---

## 📡 API Endpoints

| Method | Endpoint            | Description         |
| ------ | ------------------- | ------------------- |
| POST   | `/api/v1/reviews`      | Create a new review |
| GET    | `/api/v1/reviews/{id}` | Get a review by ID  |
| PUT    | `/api/v1/reviews/{id}` | Update a review     |
| DELETE | `/api/v1/reviews/{id}` | Delete a review     |

---

## 👤 Author

* **Monu Dhakad**
* 📌 *Engineering Student*
* [LinkedIn](https://www.linkedin.com/in/monu-dhakad-42b525276/)

---


