# Uber Review Services

This is a Spring Boot microservice for managing reviews in an Uber-like ride-sharing platform.

## Features

- Create and store reviews for rides.
- Link reviews with bookings, drivers, and passengers.
- Support for CRUD operations on reviews.
- Booking status management.
- DTO to Entity adapters for clean architecture.

## Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL / PostgreSQL** (or any preferred RDBMS)
- **Maven**

## Project Structure

src/main/java
└── org.example.uberreviewservices
├── models
│ ├── Booking.java
│ ├── Review.java
│ ├── BookingStatus.java
├── dto
│ ├── CreateReviewDto.java
├── Adapters
│ ├── CreateReviewDtoToReviewAdapter.java
│ ├── CreateReviewDtoToReviewAdapterImpl.java
├── Repositories
│ ├── BookingRepository.java
│ ├── ReviewRepository.java
├── Controllers
│ ├── ReviewController.java
├── Services
│ ├── ReviewService.java
│ ├── ReviewServiceImpl.java
