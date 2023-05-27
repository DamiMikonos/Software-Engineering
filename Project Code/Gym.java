import java.time.LocalDateTime;

public class Gym {
    private String gym_name;
    private String gym_city;
    private String gym_address;
    private int gym_number;
    private LocalDateTime gym_hours;
    private String gym_owner;

    public Gym (String gym_name, String gym_city, String gym_address, int gym_number, LocalDateTime gym_hours, String gym_owner) {
        this.gym_name = gym_name;
        this.gym_city = gym_city;
        this.gym_address = gym_address;
        this.gym_number = gym_number;
        this.gym_hours = gym_hours;
        this.gym_owner = gym_owner;
    }

    /*Get functions*/
    public String getName(){
        return gym_name;
    }
    
    public String getCity(){
        return gym_city;
    }

    public String getAddress(){
        return gym_address;
    }

    public int getNumber(){
        return gym_number;
    }

    public LocalDateTime getHours(){
        return gym_hours;
    }

    /*Search Gyms: Returns an array of Gym objects in specific city.*/
    public Gym[] searchGyms(String city){
        
        Gym[] ListOfGyms;
        ListOfGyms = new Gym[10];
        int i=0;

        for (String gym_city : Gym){
            if this.gym_city==city{
                ListOfGyms[i]=this.Gym;
                i++;
            }
        }
        return ListOfGyms[];
    }
}