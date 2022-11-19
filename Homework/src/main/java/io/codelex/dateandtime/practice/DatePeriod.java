package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    public LocalDate firstDate;
    public LocalDate secondDate;

    public DatePeriod(LocalDate firstDate, LocalDate secondDate) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {

        if (periodsEquals(firstDate, secondDate, secondPeriod.firstDate, secondPeriod.secondDate)) {
            return secondPeriod;
        } else if (includes(firstDate, secondDate, secondPeriod.firstDate, secondPeriod.secondDate)) {
            return secondPeriod;
        } else if (includes(secondPeriod.firstDate, secondPeriod.secondDate, firstDate, secondDate)) {
            return new DatePeriod(firstDate, secondDate);
        } else if (secondDate.isAfter(secondPeriod.firstDate) && firstDate.isBefore(secondPeriod.secondDate)) {
            return new DatePeriod(secondPeriod.firstDate, secondDate);
        } else if (secondPeriod.secondDate.isAfter(firstDate) && secondPeriod.firstDate.isBefore(secondDate)) {
            return new DatePeriod(firstDate, secondPeriod.secondDate);
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
