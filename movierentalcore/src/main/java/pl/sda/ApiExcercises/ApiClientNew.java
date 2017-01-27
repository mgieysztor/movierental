package pl.sda.ApiExcercises;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

/**
 * Created by Michał on 25-01-2017.
 */
public class ApiClientNew {
    public static void main(String[] args) throws UnirestException {
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

        Customer customer = Unirest.get("http://81.2.247.211:8080/customers/MG001").asObject(Customer.class).getBody();
        System.out.println(customer);
    }
}
