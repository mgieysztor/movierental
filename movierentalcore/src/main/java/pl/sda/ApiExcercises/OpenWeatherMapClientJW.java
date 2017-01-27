package pl.sda.ApiExcercises;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Michał on 25-01-2017.
 */
public class OpenWeatherMapClientJW {


    public static void main(String[] args) throws UnirestException {
        String openWeatherAppId = "bfac5e4a55493e2fcde1ad6fc1664fe2";
        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });


//        System.out.println("Podaj nazwę mista:");
//        String city = new Scanner(System.in).nextLine();
//
//        String response = Unirest
//                .get("http://api.openweathermap.org/data/2.5/weather")
//                .queryString("q", city + ",pl")
//                .queryString("appid", openWeatherAppId)
//                .asString()
//                .getBody();
//
//        System.out.println(response);


//        System.out.println("Podaj nazwę mista:");
//        String city = new Scanner(System.in).nextLine();
//
//        String city = "Wrocław";
//
//        Weather weather = Unirest
//                .get("http://api.openweathermap.org/data/2.5/weather")
//                .queryString("q", city + ",pl")
//                .queryString("appid", openWeatherAppId )
//                .asObject(Weather.class).getBody();
//
//        System.out.println(weather);


        String city = "Wrocław";

//            JsonNode jsonNode = Unirest  //opakowanie, żeby łatwiej było się dopierać do API
//                    .get("http://api.openweathermap.org/data/2.5/weather")
//                    .queryString("q", city + ",pl")
//                    .queryString("appid", openWeatherAppId)
//                    .asJson().getBody();


        Double lon = 139.0;
        Double lat = 12.0;
        JsonNode jsonNode = Unirest  //opakowanie, żeby łatwiej było się dopierać do API
                .get("http://api.openweathermap.org/data/2.5/weather")
                .queryString("lat", lat)
                .queryString("lon", lon)
                .queryString("units", "metric")
                .queryString("lang", "pl")
                .queryString("appid", openWeatherAppId)
                .asJson().getBody();


        String temp = jsonNode.getObject()
                .optJSONObject("main")
                .optString("temp");

        String weatherMain = jsonNode.getObject()
                .optJSONArray("weather")
                .getJSONObject(0)
                .optString("description");


        String description = jsonNode.getObject()
                .optJSONArray("weather")
                .getJSONObject(0)
                .optString("description");

        String name = jsonNode.getObject()
                .optString("name");



        System.out.println(temp);
        System.out.println(description);
        System.out.println(name);
    }
}

