package pl.sda.JacksonCalendar;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Michał on 24-01-2017.
 */
public class AppCalendar {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Calendar calendar = objectMapper.readValue("https://holidayapi.com/v1/holidays?key=91ab744d-5a75-40c2-8b8b-6bd38146355b&country=PL&year=2016", Calendar.class);

        System.out.println(objectMapper.writeValueAsString(calendar));

    }
}
