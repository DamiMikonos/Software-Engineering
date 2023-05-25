import java.time.LocalDate;

public class Subscription {
    private String subscriptionId;
    private LocalDate subscriptionPaymentDate;
    private int duration;
    private double price;

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

    public static void main(String[] args) {
        // Create a new Subscription object
        Subscription subscription = new Subscription("12345", LocalDate.now(), 12, 9.99);

        // Access and print subscription details
        System.out.println("Subscription ID: " + subscription.getSubscriptionId());
        System.out.println("Subscription Payment Date: " + subscription.getSubscriptionPaymentDate());
        System.out.println("Duration (months): " + subscription.getDuration());
        System.out.println("Price: $" + subscription.getPrice());
    }
}
