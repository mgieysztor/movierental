package pl.sda;

/**
 * Created by Michał on 24-01-2017.
 */
public class Owner {
    private String name;
    private String city;

    public Owner() {
    }

    public Owner(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
