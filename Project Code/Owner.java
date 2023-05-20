public class Owner extends User
{
  private String gymManagement;
  private int no_of_owned_Gyms;

  public Owner(int user_id, String user_name, String user_surname, int user_age, String user_email, int user_number, String active)
  {
    super(user_id, user_name, user_surname, user_age, user_email, user_number);
    this.gymManagement = active;
  }

  
  /* Get functions */

  public String getStatus(){
    return gymManagement;
  }
  public int getGyms(){
    return no_of_owned_Gyms;
  }
}