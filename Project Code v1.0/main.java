import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {
    
    
    public ArrayList<Gym> ListOfGyms = new ArrayList<Gym>();
    
    
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
                        System.out.println("The input date is not in the future.");
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
    
    
    /*Main program */
    public static void main(String[] args){
        manageHours();
    }
}