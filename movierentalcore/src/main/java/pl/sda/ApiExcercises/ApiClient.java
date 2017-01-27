package pl.sda.ApiExcercises;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.Scanner;


public class ApiClient {
    public static void main(String[] args) throws UnirestException, IOException {
        System.out.println("==========UNIREST===========");
//        String response = Unirest.get("http://81.2.247.211:8080/customers/MG001").asString().getBody();
//
//        String customerToAdd = "{\"firstName\":\"Marcus\",\"lastName\":\"Segundus\",\"birthYear\":1999," +
//                "\"height\":1.71,\"id\":\"MG002\"}";
//        String response = Unirest.
//                get("http://192.168.2.17:8080/customers/123456").asString().getBody();
//
//        System.out.println(response);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        Customer customer = objectMapper.readValue(response, Customer.class);
//
//        System.out.println(customer);



        System.out.println("Podaj imię");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Podaj nazwisko");
        String surname = new Scanner(System.in).nextLine();

        Customer customer = new Customer(name, surname, 2003,1.88d,"MG005");
//        String customerToAddJackson = "{\"firstName\":\"" + name + "\",\"lastName\":\"" + surname + "\",\"birthYear\":2001," +
//                "\"height\":1.65,\"id\":\"MG003\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        String customerJson = objectMapper.writeValueAsString(customer);


        String postResponse = Unirest.post("http://81.2.247.211:8080/customers/MG005")
                .header("Content-Type", "application/json")
                .body(customerJson)
                .asString().getBody();

        System.out.println(postResponse);



//        System.out.println("==========APACHE-HTTPCOMMONS===========");
//        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
//
//        HttpGet httpGet = new HttpGet("http://81.2.247.211:8080/customers");
//
//        CloseableHttpResponse execute = closeableHttpClient.execute(httpGet);
//
//        String resp = IOUtils.toString(execute.getEntity().getContent());
//        System.out.println(resp);
    }
}
