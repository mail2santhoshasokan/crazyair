package com.example.crazyair.service.impl;

import com.example.crazyair.domain.FlightSchedule;
import com.example.crazyair.factory.TestFactory;
import com.example.crazyair.repository.CrazyAirServiceRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CrazyAirServiceImplTest {

    @InjectMocks
    CrazyAirServiceImpl crazyAirService;

    @Mock
    CrazyAirServiceRepository crazyAirServiceRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void checkIfFlightSchedulesAreReturned() {
        when(crazyAirServiceRepository.findAllFlightsMatchingTheSearch(any(), any(), any(), any())).thenReturn(TestFactory.flightScheduleList());
        List<FlightSchedule> scheduleList = crazyAirService.getFlights("LHR", "COK", "2022-03-18 12:00:00.113", "2022-03-18 12:00:00.113", 3);
        Assertions.assertEquals(1, scheduleList.size());
        Assertions.assertEquals("LHR", scheduleList.get(0).getDepartureAirportCode());
        Assertions.assertEquals("COK", scheduleList.get(0).getDestinationAirportCode());
    }
}
