public class Score {
  private int score_id;
  private int score_workout_id;
  private int score_trainee_id;
  private int value; // Indicates how much the trainee scored


  public Score(int score_id, int score_workout_id, int score_trainee_id, int value)
  {
    this.score_id = score_id;
    this.score_workout_id = score_workout_id;
    this.score_trainee_id = score_trainee_id;
    this.value = value;
  }

  /* Setters */

  public void setID(int score_id) {
    this.score_id = score_id;
  }
  
  public void setWorkoutID(int score_workout_id) {
    this.score_workout_id = score_workout_id;
  }

  public void setTraineeID(int score_trainee_id) {
    this.score_trainee_id = score_trainee_id;
  }

  public void setValue(int value) {
    this.value = value;
  }

  /* Getters */

  public int getID(){
    return score_id;
  }

  public int getWorkoutID(){
    return score_workout_id;
  }

  public int getTraineeID(){
    return score_trainee_id;
  }

  public int getValue(){
    return value;
  }

  /* More methods */


}
