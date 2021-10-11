package com.acoder.authentication.domain.base;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DateFormat {
    private LocalDate firstDateinMonth;
    private LocalDate lastDateinMonth;
}
