public class Event {
    private int event_id;
    private String event_status;  /*Default = "available"*/
    private String event_coordinator;
    private String event_description;
    private String event_date;
    private String event_time;
    /* 
    Submission date
    */

    public Event(int event_id, String event_status, String event_coordinator, String event_description,
    String event_date, String event_time) {
        this.event_id = event_id;
        this.event_status = event_status;
        this.event_coordinator = event_coordinator;
        this.event_description = event_description;
        this.event_date=event_date;
        this.event_time=event_time;
    }

    /*Get functions */

    public int getEventID() { 
        return event_id;
    }
    public String getEventStatus(){
        return event_status;
    }
    public String getEventCoordinator(){
        return event_coordinator;
    }
    public String getEventDescription(){
        return event_description;
    }

    /*Search Events: Input date and outputs Event objects that are available (Available hours)*/
    public Event searchEvents(String date){
        if (this.event_date==date AND this.event_status=="available") return this.Event;
        else return null;
    }

    /*Create new event*/

    public setEvent(String event_date, String event_time, int event_id, String event_coordinator, String event_description){
        
        for (String event_date : Event){
            if this.event_date==event_date{
                for (String event_time : Event){
                    if this.event_time==event_time{
                        
                        this.event_status="verified";
                        this.event_id=event_id;
                        this.event_coordinator=event_coordinator;
                        this.event_description=event_description;
                    }
                }
            }
        }
    }
    

}
