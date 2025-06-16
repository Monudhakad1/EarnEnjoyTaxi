package org.example.uberreviewservices.Services;
import org.example.uberreviewservices.Repositories.bookingRepository;
import org.example.uberreviewservices.models.Review;
import org.example.uberreviewservices.Repositories.ReviewRepository;
import org.example.uberreviewservices.models.booking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Date;
import java.util.Optional;

@Service
public class ReviewServices implements CommandLineRunner {
    private final bookingRepository bookingRepository;
    private  ReviewRepository reviewRepository;

    public ReviewServices(ReviewRepository reviewRepository, bookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }
      @Override
    public void run(String... args) throws Exception {
        System.out.println("*********************");


//      Review r= Review.builder()
//                  .content("Amazing sir  Boss")
//                .rating(5.0)
//                .build();  // plain java object  creation
//          // this code execute sql queries
//
//          booking Book = booking.builder()
//                  .review(r)
//                  .endTime(new Date())
//                  .build();
//
//          bookingRepository.save(Book);
//
//
//          System.out.println(r);
//          List<Review> reviews = reviewRepository.findAll();
//
//          for(Review review : reviews){
//              System.out.println(review.getContent());
//          }

         Optional< booking> b=bookingRepository.findById(6L);
         if(b.isPresent()) bookingRepository.delete(b.get());
    }
}