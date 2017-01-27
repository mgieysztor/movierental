package pl.sda;

import java.util.Date;
import java.util.List;

/**
 * Created by Michał on 23-01-2017.
 */
public class Rental {
    Customer customer;
    Date startDate;
    Date endDate;
    List<Movie> movies;

    public Rental() {
    }

    public Rental(Customer customer, Date startDate, Date endDate, List<Movie> movies) {
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.movies = movies;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

//    @Override
//    public String toString() {
//        return "Rental{" +
//                "customer=" + customer +
//                ", startDate=" + startDate +
//                ", endDate=" + endDate +
//                '}';
//    }

    @Override
    public String toString() {
        return "Rental{" +
                "customer=" + customer +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", movies=" + movies +
                '}';
    }
}
