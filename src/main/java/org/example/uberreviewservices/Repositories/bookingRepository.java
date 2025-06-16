package org.example.uberreviewservices.Repositories;


import org.example.uberreviewservices.models.booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookingRepository  extends JpaRepository<booking,Long> {
}
