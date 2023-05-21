public class Gym {
    private String gym_name;
    private String gym_address;
    private int gym_number;

    public Gym (String gym_name, String gym_address, int gym_number) {
        this.gym_name = gym_name;
        this.gym_address = gym_address ;
        this.gym_number = gym_number;
    }

    /*Get functions*/
    public String getName(){
        return gym_name;
    }
    
    public String getAddress(){
        return gym_address;
    }

    public int getNumber(){
        return gym_number;
    }
}