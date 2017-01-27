package pl.sda.JacksonCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by Michał on 24-01-2017.
 */
public class Holiday {
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date observed;
    @JsonProperty("public")
    private boolean typePublic;

    public Holiday() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getObserved() {
        return observed;
    }

    public void setObserved(Date observed) {
        this.observed = observed;
    }

    public boolean isTypePublic() {
        return typePublic;
    }

    public void setTypePublic(boolean typePublic) {
        this.typePublic = typePublic;
    }
}
