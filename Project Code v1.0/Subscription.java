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
        // Define the choices
        String[] subscriptionIds = { "A", "B", "C" };
        LocalDate[] paymentDates = { LocalDate.now(), LocalDate.now(), LocalDate.now() };
        int[] durations = { 1, 3, 6 };
        double[] prices = { 10.0, 20.0, 30.0 };

        // Display the available choices
        System.out.println("Available Subscriptions:");
        for (int i = 0; i < subscriptionIds.length; i++) {
            System.out.println(i + 1 + ". Subscription " + subscriptionIds[i] + " - Duration: " + durations[i] + " months - Price: $" + prices[i]);
        }

        // Prompt the user to select a subscription
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a subscription: ");
        int choice = scanner.nextInt();

        // Validate the choice
        if (choice >= 1 && choice <= subscriptionIds.length) {
            // Create a new Subscription object with the chosen values
            Subscription subscription = new Subscription(subscriptionIds[choice - 1], paymentDates[choice - 1], durations[choice - 1], prices[choice - 1]);

            // Access and print subscription details
            System.out.println("Subscription ID: " + subscription.getSubscriptionId());
            System.out.println("Subscription Payment Date: " + subscription.getSubscriptionPaymentDate());
            System.out.println("Duration (months): " + subscription.getDuration());
            System.out.println("Price: $" + subscription.getPrice());
        } else {
            System.out.println("Invalid choice. Please select a valid subscription.");
        }

        scanner.close();
    }
}
