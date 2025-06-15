package org.example.uberreviewservices.models;

import jakarta.persistence.*;
import lombok.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name="Booking_reviews")
@Inheritance(strategy =InheritanceType.JOINED )
public class Review extends baseModel{

    @Column(nullable =false)
    private String content;

    private double rating;

    @Override

    public String toString() {return "Reviews: " + this.content + " " + this .rating + " " +this.createdAt ;}
}

// new reviews(content , rating ,created , updated)