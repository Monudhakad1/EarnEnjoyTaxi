package org.example.uberreviewservices.Repositories;

import org.example.uberreviewservices.models.Booking;
import org.example.uberreviewservices.models.Driver;
import org.example.uberreviewservices.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {


}
