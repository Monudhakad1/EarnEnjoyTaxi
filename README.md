# 🚖 Uber Review Services

![Profile Views](https://visitor-badge.laobi.icu/badge?page_id=monudhakad1.uber_review_service)

A Spring Boot microservice for managing ride reviews in an Uber-like application.

---

## 📌 Features

- ✅ Add, update, delete, and view reviews for rides
- 🔗 Connect reviews with bookings, drivers, and passengers
- 📋 Use DTOs and Adapters for clean code structure
- 📊 Manage booking statuses (Scheduled, Cancelled, Cab Arrived, Assigning Driver, In Ride, Completed)
- 🏗️ JPA Auditing for automatic timestamp management
- 🎯 Inheritance strategy for different review types
- 🔍 Custom repository queries for advanced search

---

## ⚙️ Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (or any RDBMS)
- **Gradle**
- **Lombok** (for reducing boilerplate code)
- **Postman** (for API testing)

---

## 📁 Project Structure

```
uber_review_services/
├── src/main/java/org/example/uberreviewservices/
│   ├── models/
│   │   ├── BaseModel.java
│   │   ├── Booking.java
│   │   ├── BookingStatus.java
│   │   ├── Review.java
│   │   ├── Driver.java
│   │   ├── Passenger.java
│   │   └── PassengerReview.java
│   ├── dto/
│   │   ├── CreateReviewDto.java
│   │   └── ReviewDto.java
│   ├── Adapters/
│   │   ├── CreateReviewDtoToReviewAdapter.java
│   │   └── CreateReviewDtoToReviewAdapterImpl.java
│   ├── Repositories/
│   │   ├── BookingRepository.java
│   │   ├── ReviewRepository.java
│   │   └── DriverRepository.java
│   ├── Services/
│   │   ├── ReviewService.java
│   │   └── ReviewServiceImpl.java
│   ├── Controllers/
│   │   └── ReviewController.java
│   └── UberReviewServicesApplication.java
├── src/main/resources/
│   └── application.properties
└── build.gradle
```

---

## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/monudhakad1/uber_review_service.git
   ```

2. **Navigate to the project**
   ```bash
   cd uber_review_service
   ```

3. **Configure your database**

   Open `src/main/resources/application.properties` and set:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/uber_db_local
   spring.datasource.username=root
   spring.datasource.password=enterthepasswordhere
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

4. **Build and run the application**

   ```bash
   ./gradlew bootRun
   ```

   Or use your IDE to run the `UberReviewServicesApplication.java` class.

5. **Access the application**

   The API will be available at: `http://localhost:8080`

---

## 📡 API Endpoints

| Method | Endpoint                   | Description                    | Request Body |
|--------|----------------------------|--------------------------------|--------------|
| POST   | `/api/v1/reviews`          | Create a new review            | CreateReviewDto |
| GET    | `/api/v1/reviews`          | Get all reviews                | - |
| GET    | `/api/v1/reviews/{id}`     | Get a review by ID             | - |
| PUT    | `/api/v1/reviews/{id}`     | Update a review                | Review |
| DELETE | `/api/v1/reviews/{id}`     | Delete a review                | - |

---

## 📝 API Usage Examples

### Create a Review
```bash
POST /api/v1/reviews
Content-Type: application/json

{
  "content": "Great ride! The driver was very professional and the car was clean.",
  "rating": 4.5,
  "bookingId": 1
}
```

### Get All Reviews
```bash
GET /api/v1/reviews
```

### Get Review by ID
```bash
GET /api/v1/reviews/1
```

### Update a Review
```bash
PUT /api/v1/reviews/1
Content-Type: application/json

{
  "content": "Updated review content",
  "rating": 5.0
}
```

### Delete a Review
```bash
DELETE /api/v1/reviews/1
```

---

## 🗃️ Database Schema

### Key Entities

- **Review**: Main review entity with content, rating, and booking reference
- **Booking**: Ride booking details with driver, passenger, and status
- **Driver**: Driver information with license details
- **Passenger**: Passenger information
- **BaseModel**: Abstract base class providing ID and timestamp fields

### Relationships

- Review ↔ Booking (One-to-One)
- Booking ↔ Driver (Many-to-One)
- Booking ↔ Passenger (Many-to-One)

---

## 🔧 Key Features Implemented

### JPA Auditing
- Automatic `createdAt` and `updatedAt` timestamp management
- Enabled via `@EnableJpaAuditing` annotation

### Inheritance Strategy
- `Review` entity uses `JOINED` inheritance strategy
- Supports specialized review types like `PassengerReview`

### Custom Repository Queries
- Custom queries for finding reviews by booking ID
- Rating-based filtering capabilities
- Date-based review retrieval

### DTO Pattern
- Clean separation between API contracts and domain models
- Input validation through DTOs
- Response formatting via DTOs

---

## 🛠️ Development Setup

### Prerequisites
- Java 17+
- MySQL 8.0+
- Gradle 7.0+
- IDE (IntelliJ IDEA/Eclipse)

### Database Setup
1. Create MySQL database: `uber_db_local`
2. Update connection properties in `application.properties`
3. Run the application - tables will be created automatically

### Testing
- Use Postman collection (can be imported from project documentation)
- Ensure you have booking records before creating reviews
- Test all CRUD operations

---

## 🚨 Common Issues & Solutions

### Issue: "Detached entity passed to persist"
**Solution**: Use service layer approach with single transaction

### Issue: "Uninitialized proxy passed to persist"
**Solution**: Avoid lazy loading references during entity creation

### Issue: Booking not found
**Solution**: Ensure booking records exist before creating reviews

---

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

---

## 👤 Author

**Monu Dhakad**
- 📌 *Engineering Student*
- 🔗 [LinkedIn](https://www.linkedin.com/in/monu-dhakad-42b525276/)
- 📧 [GitHub](https://github.com/monudhakad1)

---

## 📈 Future Enhancements

- [ ] Add authentication and authorization
- [ ] Implement review rating analytics
- [ ] Add notification system for new reviews
- [ ] Support for image uploads in reviews
- [ ] Implement review moderation system
- [ ] Add comprehensive unit and integration tests

---

*⭐ If you found this project helpful, please give it a star!*