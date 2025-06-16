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

    @OneToOne
    private Review review;

    @Enumerated(value= EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.DATE)
    private Date startTime;

    @Temporal(value = TemporalType.DATE)
    private Date endTime;

    private long totalDistance;
}

// One booking has one review
//