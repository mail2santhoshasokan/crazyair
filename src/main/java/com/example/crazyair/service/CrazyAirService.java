package com.example.crazyair.service;

import com.example.crazyair.domain.FlightSchedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CrazyAirService {
    List<FlightSchedule> getFlights(String origin, String destination, String departDate, String returnDate, int count);
}
