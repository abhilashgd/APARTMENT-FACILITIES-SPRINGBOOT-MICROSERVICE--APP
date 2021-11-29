package com.amenity_reservation_system.repos;

import com.amenity_reservation_system.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
