import java.util.Scanner;
import java.util.Random;
public class User
{
  Scanner inputProfile = new Scanner(System.in);
  Random rand = new Random();
  private int user_id;
  private String user_name;
  private String user_surname;
  private int user_age;
  private String user_email;
  private int user_number;

  public User(int user_id, String user_name, String user_surname, int user_age, String user_email, int user_number)
  {
    this.user_id = user_id;
    this.user_name = user_name;
    this.user_surname = user_surname;
    this.user_age = user_age;
    this.user_email = user_email;
    this.user_number = user_number;
  }
  
  /* Setters */

  public void setID(int user_id) {
    this.user_id = user_id;
  }

  public void setName(String user_name) {
    this.user_name = user_name;
  }

  public void setSurname(String user_surname) {
    this.user_surname = user_surname;
  }

  public void setAge(int user_age) {
    this.user_age = user_age;
  }

  public void setEmail(String user_email) {
    this.user_email = user_email;
  }

  public void setNumber(int user_number) {
    this.user_number = user_number;
  }

  /* Getters */

  public int getID(){
    return user_id;
  }

  public String getName(){
		return user_name;
	}

  public String getSurname(){
		return user_surname;
	}

  public int getAge(){
    return user_age;
  }

  public String getEmail(){
		return user_email;
	}
  
  public int getNumber(){
		return user_number;
	}

  /*More methods */

  public void showProfile(){
    System.out.println("Choose action: 'Edit profile' or 'Create Report'");
    String match = inputProfile.nextLine();
    if (match == "Edit Profile"){
      System.out.println("Choose the information to change: 'Name', 'Surname', 'Email', 'Number'");
      String match2 = inputProfile.nextLine();
      switch(match2){
        case "Name":
          setName(match2);
          break;
        case "Surname":
          setSurname(match2);
          break;
        case "Email":
          setEmail(match2);
          break;
        case "Number":
          int num = Integer.parseInt(match2);
          setNumber(num);
          break;
      }
    }
    else if (match == "Create Report"){
      System.out.println("Complete the report");
      System.out.println("Choose the category of the report");
      String category = inputProfile.nextLine();
      int id = rand.nextInt(999999)
      String status = "To Do";
      System.out.println("Tell us your problem");
      String message = inputProfile.nextLine();
      Report reportProfile = new Report(id, status, category, message);
      System.out.println("Your report has been created and sent");
    }
  }
}