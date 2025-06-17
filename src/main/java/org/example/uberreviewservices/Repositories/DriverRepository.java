package org.example.uberreviewservices.Repositories;

import org.example.uberreviewservices.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {
}
