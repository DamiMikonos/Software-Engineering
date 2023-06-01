import java.time.*; // For the date and time datatypes 
import java.text.DateFormat;  
import java.text.SimpleDateFormat;

public class Workout {
  private LocalDate workout_date;
  private LocalTime workout_time;
  private String workout_gym;
  private String workout_level;
  private int workout_availability; // Shows how many people already have a reservation for this workout

  public Workout(LocalDate workout_date, LocalTime workout_time, String workout_gym, String workout_level, int workout_availability)
  {
    this.workout_date = workout_date;
    this.workout_time = workout_time;
    this.workout_gym = workout_gym;
    this.workout_level = workout_level;
    this.workout_availability = workout_availability;
  }

  /* Setters */

  public void setDate(LocalDate workout_date) {
    this.workout_date = workout_date;
  }

  public void setTime(LocalTime workout_time) {
    this.workout_time = workout_time;
  }

  public void setGym(String workout_gym) {
    this.workout_gym = workout_gym;
  }

  public void setLevel(String workout_level) {
    this.workout_level = workout_level;
  }

  public void setAvailability(int workout_availability) {
    this.workout_availability = workout_availability;
  }

  /* Getters */

  public LocalDate getWorkoutDate(){
    return workout_date;
  }
  public LocalTime getWorkoutTime(){
    return workout_time;
  }
  public String getWorkoutGym(){
    return workout_gym;
  }
  public String getWorkoutLevel(){
    return workout_level;
  }
  public int getWorkoutAvailability(){
    return workout_availability;
  }
  

  /* More methods */


  public String[] getWorkoutInfo(){
    /* Converting all the non-string data to string datatype */
    DateFormat dateFormat = new SimpleDateFormat("dd-mm");
    String date_string = dateFormat.format(workout_date);
    String time_string = workout_time.toString();
    String avail_string = Integer.toString(workout_availability);

    /* Setting up an array of information to be returned */
    String[] info_array = new String[] {date_string, time_string, this.workout_gym, this.workout_level, avail_string};
		return info_array;
  }

  /* Checks if the workout is full or not */
  public boolean checkAvailability(){
    if (workout_availability < 10){
      return true;
    }
    else{
      return false;
    }
  }

  /* Checks if the trainee and workout levels match with one another */
  public boolean checkCorrespondance(Trainee t){
    if(t.getLevel()==workout_level){
      return true;
    }
    else{
      return false;
    }
  }
}