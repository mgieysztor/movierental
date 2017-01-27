package pl.sda.RestCountriesWeather;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Michał on 26-01-2017.
 */
public class RestCountriesWeatherMain {
    public static void main(String[] args) throws UnirestException {
        //https://restcountries-v1.p.mashape.com/all
        JsonNode jsonNode = Unirest
                .get("https://restcountries-v1.p.mashape.com/all")
                .header("X-Mashape-Key", "BYA9c0uaTtmshMeivQD8ZQES8Jh3p1tzJk2jsnPwrgs1x2XZkj")
                .asJson()
                .getBody();
        int jsonNodeArrayLength = jsonNode.getArray().length();
        String country;
        String capital;
        Map<String, String> countryCapitalMap = new HashMap<>();
        List<String> countries = new ArrayList<>();

        for (int i = 0; i < jsonNodeArrayLength; i++) {
            country = jsonNode
                    .getArray()
                    .getJSONObject(i)
                    .optString("name");
            capital = jsonNode
                    .getArray()
                    .getJSONObject(i)
                    .optString("capital");
            countries.add(jsonNode
                    .getArray()
                    .getJSONObject(i)
                    .opt("name")
                    .toString());
            countryCapitalMap.put(country, capital);

            System.out.println(country + " - " + countryCapitalMap.get(country));
        }
//        System.out.println(jsonNodeArrayLength);
//        System.out.println(jsonNode);


    }
}
