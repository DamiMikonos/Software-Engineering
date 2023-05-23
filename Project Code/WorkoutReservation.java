public class WorkoutReservation {
  private String workoutReservation_Date;
  private String workoutReservation_Time;
  private String workoutReservation_Status; // Shows if the reservation is valid or cancelled

  /* Constructor */
  public WorkoutReservation(String workoutReservation_Date, String workoutReservation_Time, String workoutReservation_Status){
    this.workoutReservation_Date = workoutReservation_Date;
    this.workoutReservation_Time = workoutReservation_Time;
    this.workoutReservation_Status = workoutReservation_Status;
  }
  
  
  /* Setters */

  public void setDate(String workoutReservation_Date) {
    this.workoutReservation_Date = workoutReservation_Date;
  }

  public void setTime(String workoutReservation_Time) {
    this.workoutReservation_Time = workoutReservation_Time;
  }

  public void setStatus(String workoutReservation_Status) {
    this.workoutReservation_Status = workoutReservation_Status;
  }

  /* Get functions */

  public String getWorkoutReservationDate(){
    return workoutReservation_Date;
  }
  public String getWorkoutReservationTime(){
    return workoutReservation_Time;
  }
  public String getWorkoutReservationStatus(){
    return workoutReservation_Status;
  }
}


