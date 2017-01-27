package pl.sda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michał on 24-01-2017.
 */
public class Bank {
    private List<CreditCard> creditCards = new ArrayList<>();
    private Owner owner;
    private String id;

    public Bank() {
    }

    public Bank(List<CreditCard> creditCards, Owner owner, String id) {
        this.creditCards = creditCards;
        this.owner = owner;
        this.id = id;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
