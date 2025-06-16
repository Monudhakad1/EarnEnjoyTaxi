package org.example.uberreviewservices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends baseModel {


    private String name;


    @OneToMany(mappedBy= "passenger")
    private List<booking> bookings=new ArrayList<>();
}
