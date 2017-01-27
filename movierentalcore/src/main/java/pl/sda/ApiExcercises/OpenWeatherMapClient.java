package pl.sda.ApiExcercises;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Michał on 25-01-2017.
 */
public class OpenWeatherMapClient {

    public static void main(String[] args) throws UnirestException {
        //?q=Wroclaw,pl&appid=bfac5e4a55493e2fcde1ad6fc1664fe2

        //podajemy nazwę miasta i ma nam wyświetlić temperaturę w C
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


        System.out.println("Podaj nazwę miasta");
        String city = new Scanner(System.in).nextLine();



        String openWeatherAppId = "bfac5e4a55493e2fcde1ad6fc1664fe2";
        String response = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                .queryString("q", city+",pl")
                .queryString("appid", openWeatherAppId).asString().getBody();
        OpenWeatherMap openWeatherMap = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                .queryString("q", city+",pl")
                .queryString("appid", openWeatherAppId)
                .asObject(OpenWeatherMap.class)
                .getBody();

        double temp = openWeatherMap.getMain().getTemp();
        System.out.println(temp);

    }
}
