package pl.sda.JacksonCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Map;

/**
 * Created by Michał on 24-01-2017.
 */
public class Calendar {
    private int status;
    Map<Date,Holiday> holidays;

    public Calendar() {
    }

    public Calendar(int status, Map<Date, Holiday> holidays) {
        this.status = status;
        this.holidays = holidays;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<Date, Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<Date, Holiday> holidays) {
        this.holidays = holidays;
    }
}
