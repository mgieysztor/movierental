package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Michał on 24-01-2017.
 */
public class AppBank {
    public static void main(String[] args) throws IOException {
        ObjectMapper myObjectMapper = new ObjectMapper();

        FileReader fileReader = new FileReader("myJackson.json");
        Bank bank = myObjectMapper.readValue(fileReader, Bank.class);

        System.out.println(myObjectMapper.writeValueAsString(bank));

    }
}
