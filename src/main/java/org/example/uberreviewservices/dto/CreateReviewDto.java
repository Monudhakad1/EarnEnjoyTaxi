package org.example.uberreviewservices.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter

public class CreateReviewDto {

    private String content;

    private double rating;

    private Long bookingId;

}
