package pl.sda.ApiExcercises;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by Michał on 26-01-2017.
 */
public class HolidaysAPI {
    public static void main(String[] args) throws UnirestException {
        String testKey = "200ee39d-f943-4d0b-9a1c-644fa660e0aa";
        String liveKey = "0c32da60-9f52-4dfa-8625-09be15b5e726";
        String country="PL";
        String year = "2016";
        String month;

        JsonNode jsonNode = Unirest
                .get( "https://holidayapi.com/v1/holidays")
                .queryString("key",liveKey)
                .queryString("country",country)
                .queryString("year",year)
                .asJson()
                .getBody();

        System.out.println(jsonNode);





    }
}
