package com.example.crazyair.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity()
@Table(name = "FlightSchedule")
public class FlightSchedule {
    @Id
    private int id;

    @Column
    private String airline;

    @Column
    private String price;

    @Column
    private String cabinClass;

    @Column
    private String departureAirportCode;

    @Column
    private String destinationAirportCode;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss.SSS")
    private LocalDateTime departureDate;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss.SSS")
    private LocalDateTime arrivalDate;
}
