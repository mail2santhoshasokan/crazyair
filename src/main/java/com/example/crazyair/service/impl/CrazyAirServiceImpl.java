package com.example.crazyair.service.impl;

import com.example.crazyair.domain.FlightSchedule;
import com.example.crazyair.repository.CrazyAirServiceRepository;
import com.example.crazyair.service.CrazyAirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CrazyAirServiceImpl implements CrazyAirService {

    @Autowired
    CrazyAirServiceRepository crazyAirServiceRepository;

    @Override
    public List<FlightSchedule> getFlights(String origin, String destination, String departDate, String returnDate, int count) {
        List<FlightSchedule> flightScheduleList = crazyAirServiceRepository.findAllFlightsMatchingTheSearch(origin, destination, departDate, returnDate);
        return flightScheduleList;
    }
}
