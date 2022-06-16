package Bankomate.entity;

public class Card {

    private long cardNumber;
    private int pinCode;
    private String currency;
    private int cashAmount;

    public Card(long cardNumber, int pinCode, String currency, int cashAmount) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.currency = currency;
        this.cashAmount = cashAmount;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }
}
