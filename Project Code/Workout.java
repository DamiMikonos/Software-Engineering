public class Workout {
  private String workout_date;
  private String workout_time;
  private String workout_gym;
  private String workout_level;
  private int workout_availability; // Shows how many people already have a reservation for this workout

  public Workout(String workout_date, String workout_time, String workout_gym, String workout_level, int workout_availability)
  {
    this.workout_date = workout_date;
    this.workout_time = workout_time;
    this.workout_gym = workout_gym;
    this.workout_level = workout_level;
    this.workout_availability = workout_availability;
  }

  
  /* Get functions */

  public String getWorkoutDate(){
    return workout_date;
  }
  public String getWorkoutTime(){
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
}
