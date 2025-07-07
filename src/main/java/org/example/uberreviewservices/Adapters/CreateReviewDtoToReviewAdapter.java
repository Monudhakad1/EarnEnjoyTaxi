package org.example.uberreviewservices.Adapters;

import org.example.uberreviewservices.dto.CreateReviewDto;
import org.example.uberreviewservices.models.Review;

public interface CreateReviewDtoToReviewAdapter {
    Review convertDto(CreateReviewDto request);
}
