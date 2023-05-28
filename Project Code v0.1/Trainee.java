public class Trainee extends User
{
  private String trainee_level;
  private String performance; /* NEED TO FIX NAMING */
  private String subscription_status;

  public Trainee(int user_id, String user_name, String user_surname, int user_age, String user_email, int user_number, String trainee_level, String performance, String subscription_status)
  {
    super(user_id, user_name, user_surname, user_age, user_email, user_number);
    this.trainee_level = trainee_level;
    this.performance = performance;
    this.subscription_status = subscription_status;
  }

  /* Setters*/
  
  public void setLevel(String trainee_level) {
    this.trainee_level = trainee_level;
  }

  public void setPerformance(String performance) {
    this.performance = performance;
  }

  public void setStatus(String subscription_status) {
    this.subscription_status = subscription_status;
  }

  /* Getters*/

  public String getLevel(){
		return trainee_level;
	}
  public String getPerformance(){
		return performance;
	}
  public String getStatus(){
		return subscription_status;
	}
}
