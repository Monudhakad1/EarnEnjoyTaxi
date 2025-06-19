package org.example.uberreviewservices.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class booking extends baseModel {

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE} )
    private Review review;

    @Enumerated(value= EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.DATE)
    private Date startTime;

    @Temporal(value = TemporalType.DATE)
    private Date endTime;

    private long totalDistance;

    @ManyToOne
    private Driver driver; //Many to one that means many id in booking

    private Passenger passenger;



}

// One booking has one review
//