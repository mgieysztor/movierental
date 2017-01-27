package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Date;
import java.io.IOException;

/**
 * Created by Michał on 23-01-2017.
 */
public class AppJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        //ZAMIANA OBIEKTU NA JSON
        Customer customer = new Customer("adam", "Kowlaski", 1980, "123", new Date());
        String customerJson = objectMapper.writeValueAsString(customer);
        System.out.println(customerJson);

        //ZAMIANA JSONa NA OBIEKT
        String json = "{\n" +
                " \"firstName\" : \"adam\",\n" +
                "\"lastName\" : \"Kowlaski\",\n" +      // \23 wpisze ASCII o kodzie 23
                "\"birthYear\" : 1980,\n" +
                "\"idNumber\" : \"123\"\n" +
                "}";
        objectMapper.readValue(json, Customer.class);

//        String jsonString = "{\"customer\":{\"firstName\":\"Adam\",\"lastName\":\"Kowalski\",\"birthYear\":1980,\"idNumber\":\"123\"},\"startDate\":\"Jan 23, 2017 8:15:48 PM\",\"endDate\":\"Jan 23, 2017 8:15:48 PM\"}";
//        Rental rental = objectMapper.readValue(jsonString, Rental.class);
//        System.out.println(rental);
    }
}
