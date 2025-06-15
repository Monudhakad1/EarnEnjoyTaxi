package org.example.uberreviewservices.models;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name="driver_reviews_id")
public class driverReviews extends Review {
    private String DriverReview;

}
