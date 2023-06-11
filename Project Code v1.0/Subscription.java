import java.time.LocalDate;


public class Subscription {
    private String subscriptionId;
    private LocalDate subscriptionPaymentDate;
    private int duration;
    private double price;
    
 // Payment card details
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;
    private int cvv;

    public Subscription(String subscriptionId, LocalDate subscriptionPaymentDate, int duration, double price) {
        this.subscriptionId = subscriptionId;
        this.subscriptionPaymentDate = subscriptionPaymentDate;
        this.duration = duration;
        this.price = price;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public LocalDate getSubscriptionPaymentDate() {
        return subscriptionPaymentDate;
    }

    public void setSubscriptionPaymentDate(LocalDate subscriptionPaymentDate) {
        this.subscriptionPaymentDate = subscriptionPaymentDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // Getters and setters for payment card details
    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
