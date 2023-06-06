public class Score {
  private int score_id;
  private int score_workout_id;
  private int score_trainee_id;


  public Score(int score_id, int score_workout_id, int score_trainee_id)
  {
    this.score_id = score_id;
    this.score_workout_id = score_workout_id;
    this.score_trainee_id = score_trainee_id;
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

  /* Getters */

  public int getID(){
    return score_id;
  }

  public int getWorkoutID(){
    return score_workout_id;
  }

  public int getTraineeDate(){
    return score_trainee_id;
  }

  /* More methods */


}
