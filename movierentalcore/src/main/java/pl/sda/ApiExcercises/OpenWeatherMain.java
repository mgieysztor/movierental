package pl.sda.ApiExcercises;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Michał on 25-01-2017.
 */
@JsonIgnoreProperties (ignoreUnknown = true)
public class OpenWeatherMain {
    private double temp;

    public OpenWeatherMain() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
