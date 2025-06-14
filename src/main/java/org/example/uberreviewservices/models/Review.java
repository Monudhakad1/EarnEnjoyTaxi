package org.example.uberreviewservices.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.processing.Generated;
import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name="Bookingreviews")
public class Review {

    @Id  //this property makes the id property as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // IDENTITY MEANS AUTO INCREMENT AND MANY MORE RESEARCH AND ADD THEM
    long id;


    @Column(nullable =false)
    String content;



    Double rating;


            @Temporal(TemporalType.TIMESTAMP) // tells spring about time date type
            @CreatedDate // this anotation tells spring only adjust creation
    Date createdAt;


            @Temporal(TemporalType.TIMESTAMP) // date property
            @LastModifiedDate
    Date updatedAt;


}

// new reviews(content , rating ,created , updated)