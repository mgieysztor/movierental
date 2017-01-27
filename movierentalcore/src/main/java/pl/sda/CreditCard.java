package pl.sda;

/**
 * Created by Michał on 24-01-2017.
 */
public class CreditCard {
    private String number;
    private String money;
    private String currency;

    public CreditCard() {
    }

    public CreditCard(String number, String money, String currency) {
        this.number = number;
        this.money = money;
        this.currency = currency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
