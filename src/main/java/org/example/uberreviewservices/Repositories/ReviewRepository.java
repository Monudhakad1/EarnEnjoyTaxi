package org.example.uberreviewservices.Repositories;

import org.example.uberreviewservices.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ReviewRepository implements JpaRepository<Review, Long> {

}
