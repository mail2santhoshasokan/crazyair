package com.example.crazyair.controller;

import com.example.crazyair.domain.FlightSchedule;
import com.example.crazyair.service.CrazyAirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController()
@RequestMapping("/crazyair")
@Validated()
public class CrazyAirController {

    @Autowired
    private CrazyAirService crazyAirService;

    @GetMapping("/flightSchedules")
    public ResponseEntity<List<FlightSchedule>> getFlights(
            @RequestParam(name = "origin") String origin,
            @RequestParam(name = "destination") String destination,
            @RequestParam(name = "departureDate") String departureDate,
            @RequestParam(name = "returnDate") String returnDate,
            @RequestParam(name = "passengerCount") @Max(value = 2, message = "value must be equal to or greater than zero") int passengerCount) {
        return ResponseEntity.ok().body(crazyAirService.getFlights(origin, destination, departureDate, returnDate, passengerCount));
    }

}
