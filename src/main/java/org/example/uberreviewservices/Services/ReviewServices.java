package org.example.uberreviewservices.Services;
import org.example.uberreviewservices.models.Review;
import org.example.uberreviewservices.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {
    private  ReviewRepository reviewRepository;

    public ReviewServices(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
      @Override
    public void run(String... args) throws Exception {
        System.out.println("*********************");
      Review r= Review.builder().content("Amazing sir  Boss")

                .rating(5.0)
                .build();  // plain java object  creation
          reviewRepository.save(r); // this code execute sql queries

          List<Review> reviews = reviewRepository.findAll();
          reviewRepository.deleteById(3L);
          for(Review review : reviews){
              System.out.println(review.getContent());
          }
    }
}