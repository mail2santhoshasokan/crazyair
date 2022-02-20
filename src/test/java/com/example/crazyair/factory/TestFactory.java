package com.example.crazyair.factory;

import com.example.crazyair.domain.FlightSchedule;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TestFactory {
    public static List<FlightSchedule> flightScheduleList() {
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setAirline("Lufthansa");
        flightSchedule.setPrice("1500");
        flightSchedule.setDepartureAirportCode("LHR");
        flightSchedule.setDestinationAirportCode("COK");
        flightSchedule.setArrivalDate(LocalDateTime.now());
        flightSchedule.setDepartureDate(LocalDateTime.now());
        return Arrays.asList(flightSchedule);
    }
}
