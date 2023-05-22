public class Event {
    private int event_id;
    private String event_status;
    private String event_coordinator;
    private String event_description;
    /*
    Event_date 
    Submission date
    */

    public Event(int event_id, String event_status, String event_coordinator, String event_description) {
        this.event_id = event_id;
        this.event_status = event_status;
        this.event_coordinator = event_coordinator;
        this.event_description = event_description;
    }

    /*Get functions */

    public int getID() { 
        return event_id;
    }
    public String getStatus(){
        return event_status;
    }
    public String getCoordinator(){
        return event_coordinator;
    }
    public String getDescription(){
        return event_description;
    }
}
