import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
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

        
    
    
    /*Main program */
    public static void main(String[] args){

        Score s = new Score(1, 1, 1, 10);

        s.getTraineeID();
    }
}