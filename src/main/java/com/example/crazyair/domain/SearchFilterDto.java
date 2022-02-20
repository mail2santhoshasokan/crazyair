package com.example.crazyair.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SearchFilterDto {
    String origin;
    String destination;
    String departDate;
    String returnDate;
    String count;
}
