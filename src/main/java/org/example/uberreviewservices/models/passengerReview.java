package org.example.uberreviewservices.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class passengerReview extends Review {

    private String passengerReviewContent;

    private String passengerRating;

}
