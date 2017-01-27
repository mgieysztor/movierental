package pl.sda.RestCountriesWeather;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestCountriesWeatherJW {
    public static void main(String[] args) throws UnirestException {
        JsonNode response = Unirest.get("https://restcountries-v1.p.mashape.com/all")
                .header("X-Mashape-Key", "NqMphWw04mmshJhkgC1nSywvqGYqp1rxhcKjsnv0r6yJxyODAp")
                .header("Accept", "application/json")
                .asJson().getBody();

        JSONArray array = response.getArray();

        int size = array.length();

        for (int i = 0; i < size; i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            String countryName = jsonObject.optString("name");
            String capital = jsonObject.optString("capital");
            System.out.println(countryName + " - " + capital);

//            if(!capital.isEmpty())
            if (capital.length() > 0) {
                JsonNode jsonNode = Unirest
                        .get("http://api.openweathermap.org/data/2.5/weather")
                        .queryString("q", capital)
                        .queryString("lang", "pl")
                        .queryString("units", "metric")
                        .queryString("appid", "a1fb2306e8575f67c23fc8f23062f7e1")
                        .asJson().getBody();

                String temp = jsonNode.getObject()
                        .optJSONObject("main")
                        .optString("temp");

                System.out.println(temp);


            }


        }
    }
}
