public class Worker extends User
{
  private String specialization;
  private String work_experience;
  private String working_hours;

  public Worker(int user_id, String user_name, String user_surname, int user_age, String user_email, int user_number, String specialization, String work_experience, String working_hours)
  {
    super(user_id, user_name, user_surname, user_age, user_email, user_number);
    this.specialization = specialization;
    this.work_experience = work_experience;
    this.working_hours = working_hours;
  }

    /* Setters */
  
    public void setSpecialization(String specialization) {
      this.specialization = specialization;
    }
    
    public void setWorkExperience(String work_experience) {
      this.work_experience = work_experience;
    }
      
    public void setWorkingHours(String working_hours) {
      this.working_hours = working_hours;
    }

    /* Getters */

    public String getSpecialization(){
      return specialization;
    }
    public String getWorkExperience(){
      return work_experience;
    }
    public String getWorkingHours(){
      return working_hours;
    }
}