public class Owner extends User
{
  private String owner_status; // Value: "Is manager"
  private int no_of_owned_Gyms;

  public Owner(int user_id, String user_name, String user_surname, int user_age, String user_email, int user_number, String owner_status, int no_of_owned_Gyms)
  {
    super(user_id, user_name, user_surname, user_age, user_email, user_number);
    this.owner_status = owner_status;
    this.no_of_owned_Gyms = no_of_owned_Gyms;
  }

  /* Setters*/
  
  public void setStatus(String owner_status) {
    this.owner_status = owner_status;
  }

  public void setGyms(int no_of_owned_Gyms) {
    this.no_of_owned_Gyms = no_of_owned_Gyms;
  }

  /* Getters */

  public String getStatus(){
    return owner_status;
  }
  public int getGyms(){
    return no_of_owned_Gyms;
  }
}