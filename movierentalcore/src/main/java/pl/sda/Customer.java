package pl.sda;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Created by Michał on 23-01-2017.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private int birthYear;
    @JsonIgnore
    private String idNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date date;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int birthYear, String idNumber, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.idNumber = idNumber;
        this.date = date;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
