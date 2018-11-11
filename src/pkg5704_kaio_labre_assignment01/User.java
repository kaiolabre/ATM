package pkg5704_kaio_labre_assignment01;

public class User {
    //ATM only needs these two attributes from the user in order to work:
    private int cardNumber, cardPin;

    public User(int cardNumber, int cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }
    //set values
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void setCardPin(int cardPin) {
        this.cardPin = cardPin;
    }
    //get values
    public int getCardNumber() {
        return cardNumber;
    }

    public int getCardPin() {
        return cardPin;
    }    
}
