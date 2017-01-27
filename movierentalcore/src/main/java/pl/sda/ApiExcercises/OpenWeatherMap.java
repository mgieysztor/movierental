package pl.sda.ApiExcercises;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Michał on 25-01-2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherMap {
    private OpenWeatherMain main; //= new OpenWeatherMain();

    public OpenWeatherMap() {
    }

    public OpenWeatherMain getMain() {
        return main;
    }

    public void setMain(OpenWeatherMain main) {
        this.main = main;
    }
}
