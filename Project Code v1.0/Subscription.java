import java.time.LocalDate;
import java.util.Scanner;

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

         // Get new subscription details from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new subscription ID: ");
        String newSubscriptionId = scanner.nextLine();

        System.out.print("Enter new subscription payment date (YYYY-MM-DD): ");
        String newPaymentDateStr = scanner.nextLine();
        LocalDate newPaymentDate = LocalDate.parse(newPaymentDateStr);

        System.out.print("Enter new duration (months): ");
        int newDuration = scanner.nextInt();

        System.out.print("Enter new price: $");
        double newPrice = scanner.nextDouble();

        // Create a new Subscription object with the inputted details
        Subscription subscription = new Subscription(newSubscriptionId, newPaymentDate, newDuration, newPrice);

        // Access and print subscription details
        System.out.println("Subscription ID: " + subscription.getSubscriptionId());
        System.out.println("Subscription Payment Date: " + subscription.getSubscriptionPaymentDate());
        System.out.println("Duration (months): " + subscription.getDuration());
        System.out.println("Price: $" + subscription.getPrice());
    
    scanner.close();

        
    }
}
