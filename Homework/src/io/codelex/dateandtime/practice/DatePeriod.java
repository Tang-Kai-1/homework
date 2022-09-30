package io.codelex.dateandtime.practice;

import io.codelex.classesandobjects.practice.Date;

import java.time.LocalDate;

public class DatePeriod {
    public LocalDate firstDate;
    public LocalDate secondDate;

    public DatePeriod(LocalDate firstDate, LocalDate secondDate) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        LocalDate firstPeriodFirstDate = firstDate;
        LocalDate firstPeriodSecondDate = secondDate;
        LocalDate secondPeriodFirstDate = secondPeriod.firstDate;
        LocalDate secondPeriodSecondDate = secondPeriod.secondDate;

        if (periodsEquals(firstPeriodFirstDate, firstPeriodSecondDate, secondPeriodFirstDate, secondPeriodSecondDate)) {
            return secondPeriod;
        } else if (includes(firstPeriodFirstDate, firstPeriodSecondDate, secondPeriodFirstDate, secondPeriodSecondDate)) {
            return secondPeriod;
        } else if (includes(secondPeriodFirstDate, secondPeriodSecondDate, firstPeriodFirstDate, firstPeriodSecondDate)) {
            return new DatePeriod(firstPeriodFirstDate, firstPeriodSecondDate);
        } else if (firstPeriodSecondDate.isAfter(secondPeriodFirstDate) && firstPeriodFirstDate.isBefore(secondPeriodSecondDate)) {
            return new DatePeriod(secondPeriodFirstDate, firstPeriodSecondDate);
        } else if (secondPeriodSecondDate.isAfter(firstPeriodFirstDate) && secondPeriodFirstDate.isBefore(firstPeriodSecondDate)) {
            return new DatePeriod(firstPeriodFirstDate, secondPeriodSecondDate);
        }
        return null;
    }

    private boolean includes(LocalDate firstStartDate, LocalDate fristEndDate, LocalDate secondStartDate, LocalDate secondEndDate) {
        return (firstStartDate.isBefore(secondStartDate)) && (fristEndDate.isAfter(secondEndDate));
    }

    private boolean periodsEquals(LocalDate firstStartDate, LocalDate fristEndDate, LocalDate secondStartDate, LocalDate secondEndDate) {
        return (firstStartDate.equals(secondStartDate)) && (fristEndDate.equals(secondEndDate));
    }
}
