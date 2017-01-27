package pl.sda.ApiExcercises;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Michał on 25-01-2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true) //dzięki temu możemy wyciągać sobie z jsona tylko te dane, które nas interesują
public class Customer {
    @JsonIgnore
    private String firstName;
    private String lastName;
    private int birthYear;
    private double height;
    private String id;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int birthYear, double height, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", height=" + height +
                ", id='" + id + '\'' +
                '}';
    }
}
