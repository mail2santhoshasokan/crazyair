package com.example.crazyair.repository;

import com.example.crazyair.domain.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrazyAirServiceRepository extends JpaRepository<FlightSchedule, Integer> {
    @Query(value = "SELECT * FROM FlightSchedule WHERE departureAirportCode = :departureAirportCode AND destinationAirportCode = :destinationAirportCode AND departureDate = :departureDate AND arrivalDate = :arrivalDate", nativeQuery = true)
    List<FlightSchedule> findAllFlightsMatchingTheSearch(
            String departureAirportCode,
            String destinationAirportCode,
            String departureDate,
            String arrivalDate);
}
