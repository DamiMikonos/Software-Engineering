import java.time.*;

public class WorkoutReservation {
  private LocalDate workoutReservation_Date;
  private LocalTime workoutReservation_Time;
  private String workoutReservation_Status; // Shows if the reservation is valid or cancelled

  /* Constructor */
  public WorkoutReservation(String workoutReservation_Status){
    this.workoutReservation_Date = LocalDate.now();
    this.workoutReservation_Time = LocalTime.now();
    this.workoutReservation_Status = workoutReservation_Status;
  }
  
  
  /* Setters */

  public void setDate() {
    this.workoutReservation_Date = LocalDate.now();
  }

  public void setTime() {
    this.workoutReservation_Time = LocalTime.now();
  }

  public void setStatus(String workoutReservation_Status) {
    this.workoutReservation_Status = workoutReservation_Status;
  }

  /* Get functions */

  public LocalDate getWorkoutReservationDate(){
    return workoutReservation_Date;
  }
  public LocalTime getWorkoutReservationTime(){
    return workoutReservation_Time;
  }
  public String getWorkoutReservationStatus(){
    return workoutReservation_Status;
  }
}


