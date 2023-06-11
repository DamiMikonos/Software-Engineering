import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;


public class Main {

	
	
	 public ArrayList<Gym> ListOfGyms = new ArrayList<Gym>();
	    public ArrayList<Workout> ListOfWorkouts = new ArrayList<Workout>();
	    public ArrayList<Score> ListOfScores = new ArrayList<Score>();

	    
	    /*Manage Hours of Gyms */
	    public void manageHours(){
	        /*Need to display List of Gyms Owned by called Owner */
	        Scanner input = new Scanner(System.in);
	        System.out.println("Type in the name of the owner");
	        String ownerString = input.nextLine();
	        for(Gym gyms : ListOfGyms){
	            if(gyms.getOwner().equals(ownerString)){
	                /*Select and use gym instance to set Hours */
	                Gym match = gyms;
	                System.out.println("Enter datetime (format: yyyy-MM-dd HH:mm:ss): ");
	                String userInput = input.nextLine();
	                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	                Date date;
	                try {
	                    date = dateFormat.parse(userInput);
	                    Date currentDate = new Date();  // Get the current date
	                    if (date.after(currentDate)) {
	                        System.out.println("The input date is in the future.");
	                    } else {
	                       throw new NoFutureDateException("The input date is not in the future."); /*This and next Exception not completed */
	                    }
	                } catch (ParseException e) {
	                    System.out.println("Invalid datetime format");
	                }
	                match.setDate(date);
	                System.out.println("The hours are updated successfully");
	            }
	            else
	            System.out.println("The given name is invalid or does not have Gyms");
	        }
	    }

	    /* Upload grades of the Trainees */
	    public void uploadGrades(){
	        for(Workout w : ListOfWorkouts){
	            SimpleDateFormat date_string = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	            String date_str = date_string.format(w.getWorkoutDate());
	            String id_str = Integer.toString(w.getID());
	            // An array that contains the workout ids and dates to be printed 
	            String[] workout_info_array = new String[] {id_str, date_str};
	            System.out.println(workout_info_array);
	        }
	        Scanner input = new Scanner(System.in);
	        System.out.println("Type in the workout id");
	        int x = input.nextInt();
	        for(Score s : ListOfScores){
	            if(s.getWorkoutID() == x){
	                System.out.println(s.getTraineeID());
	            }
	        }
	        System.out.println("Type in the trainee id");
	        int y = input.nextInt();
	        for(Score s : ListOfScores){
	            if(s.getWorkoutID() == x && s.getTraineeID() == y){
	                System.out.println("Type in the score");
	                int z = input.nextInt();
	                s.setValue(z);
	            }
	        }
	    }

	        
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 Score s = new Score(1, 1, 1, 10);

	        s.getTraineeID();
	        
		
		// Define the choices
        String[] subscriptionIds = { "A", "B", "C" };
        LocalDate[] paymentDates = { LocalDate.now(), LocalDate.now(), LocalDate.now() };
        int[] durations = { 1, 3, 6 };
        double[] prices = { 10.0, 20.0, 30.0 };

        Scanner scanner = new Scanner(System.in);
        User user = new User(1, "John", "Doe", 30, "johndoe@example.com", 123456789);
        boolean exitProgram = false;

        while (!exitProgram) {
            // Display the menu options
            System.out.println("Menu:");
            System.out.println("1. Select Subscription");
            System.out.println("2. Create Report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (menuChoice) {
                case 1:
                    selectSubscription(subscriptionIds, paymentDates, durations, prices, scanner);
                    break;
                case 2:
                	createReport(scanner, user);
                    break;
                case 3:
                    exitProgram = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }

     // Close the scanner
        scanner.close();
    }
       

    private static void selectSubscription(String[] subscriptionIds, LocalDate[] paymentDates, int[] durations, double[] prices, Scanner scanner) {
            boolean subscriptionSelected = false;  
            
        while (!subscriptionSelected) {
            // Display the available choices
            System.out.println("Available Subscriptions:");
            for (int i = 0; i < subscriptionIds.length; i++) {
                System.out.println(i + 1 + ". Subscription " + subscriptionIds[i] + " - Duration: " + durations[i] + " months - Price: $" + prices[i]);
            }

            // Prompt the user to select a subscription
            System.out.print("Select a subscription (or enter 'cancel' to exit): ");
            String choiceInput = scanner.nextLine();

            if (choiceInput.equalsIgnoreCase("cancel")) {
                System.out.println("Subscription selection canceled. Exiting the program.");
                break;
            }

            try {
                int choice = Integer.parseInt(choiceInput);

                // Validate the choice
                if (choice >= 1 && choice <= subscriptionIds.length) {
                    // Create a new Subscription object with the chosen values
                    Subscription subscription = new Subscription(subscriptionIds[choice - 1], paymentDates[choice - 1], durations[choice - 1], prices[choice - 1]);

                    // Access and print subscription details
                    System.out.println("Subscription ID: " + subscription.getSubscriptionId());
                    System.out.println("Duration (months): " + subscription.getDuration());
                    System.out.println("Price: $" + subscription.getPrice());

                    boolean paymentCompleted = false;
                    while (!paymentCompleted) {
                        System.out.print("Click on 'Continue Payment' to proceed or 'Cancel' to go back: ");
                        String paymentChoice = scanner.nextLine();

                        if (paymentChoice.equalsIgnoreCase("Continue")) {
                            // Get payment card details from the user
                            System.out.print("Cardholder's Name: ");
                            String cardholderName = scanner.nextLine();
                            System.out.print("Card Number: ");
                            String cardNumber = scanner.nextLine();
                            System.out.print("Expiration Date (MM/YY): ");
                            String expirationDate = scanner.nextLine();
                            System.out.print("CVV: ");
                            int cvv = scanner.nextInt();

                            // Set the payment card details in the subscription object
                            subscription.setCardholderName(cardholderName);
                            subscription.setCardNumber(cardNumber);
                            subscription.setExpirationDate(expirationDate);
                            subscription.setCvv(cvv);

                            if (cardholderName.isEmpty() || cardNumber.isEmpty() || expirationDate.isEmpty() || Integer.toString(cvv).isEmpty()) {
                                System.out.println("Please fill in all the payment card details.");
                            } else {
                                System.out.println("Subscription Payment Date: " + subscription.getSubscriptionPaymentDate());
                                paymentCompleted = true;
                            }
                        } else if (paymentChoice.equalsIgnoreCase("Cancel")) {
                            System.out.println("Payment canceled. Returning to subscription selection.");
                            break;
                        } else {
                            System.out.println("Invalid choice. Payment canceled. Returning to subscription selection.");
                            break;
                        }
                    }

                    if (paymentCompleted) {
                        subscriptionSelected = true;
                    }
                } else {
                    System.out.println("Invalid choice. Please select a valid subscription.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'cancel'.");
            }
        }
        
    }    

        
	
    private static void createReport(Scanner scanner, User user) {
    	
        
        // Prompt the user for report details
        System.out.print("Enter report ID: ");
        int reportId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter report status: ");
        String status = scanner.nextLine();

        System.out.print("Enter report category: ");
        String reportCategory = scanner.nextLine();

        System.out.print("Enter report description: ");
        String reportDescription = scanner.nextLine();
        
        LocalDate reportDate = LocalDate.now();


        // Create the report instance
        Report report = new Report(reportId, status, reportCategory, reportDescription, reportDate);
        
        

        // Display the report details
       System.out.println("Report created:");
        System.out.println("Report ID: " + report.getReportId());
        System.out.println("Status: " + report.getStatus());
        System.out.println("Category: " + report.getReportCategory());
        System.out.println("Description: " + report.getReportDescription());
        System.out.println("Date: " + report.getReportDate());
        

	}

}
