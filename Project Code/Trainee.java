public class Trainee extends User
{
  private String trainee_level;
  private String performance; /* NEED TO FIX NAMING */
  private String is_Subscribed;

  public Trainee(int user_id, String user_name, String user_surname, int user_age, String user_email, int user_number, String trainee_level, String performance, String is_Subscribed)
  {
    super(user_id, user_name, user_surname, user_age, user_email, user_number);
    this.trainee_level = trainee_level;
    this.performance = performance;
    this.is_Subscribed = is_Subscribed;
  }

  
  /* Get functions */

  public String getLevel(){
		return trainee_level;
	}
  public String getPerformance(){
		return performance;
	}
  public String getSubscriptionStatus(){
		return is_Subscribed;
	}
}
