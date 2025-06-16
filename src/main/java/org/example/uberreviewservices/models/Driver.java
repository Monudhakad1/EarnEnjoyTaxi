package org.example.uberreviewservices.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Driver extends baseModel{

    private String name;

    @Column(nullable = false , unique = true)
    private String drivingLicense;

    @OneToMany(mappedBy = "driver")
    private List<booking> bookings= new ArrayList<>();

    // Monu Dhakad //

}
