public class EventSubmission {
    private int submission_id=0;
    private int submission_trainee_id;
    private String submission_summary;
    private String submission_status;
    private String submission_event_time;
    private String submission_event_date;
    /*Dates */

    public EventSubmission(int submission_trainee_id, String submission_summary, String submission_status, String submission_event_time, String submission_event_date){
        this.submission_id = submission_id++;
        this.submission_trainee_id = submission_trainee_id;
        this.submission_summary = submission_summary;
        this.submission_status = submission_status;
        this.submission_event_time = submission_event_time;
        this.submission_event_date = submission_event_date;
    }

    /*Get functions */
    public int getID() {
        return submission_id;
    }
    public int getTraineeID() {
        return submission_trainee_id;
    }
    public String getSummary(){
        return submission_summary;
    }
    public String getStatus() {
        return submission_status;
    }
    public String getDate(){
        return submission_event_date;
    }
    public String getTime(){
        return submission_event_time;
    }


    /*Create New Event Submission*/
    public void createEventSubmission(int trainee_id, String summary, String event_date, String event_time){
        new EventSubmission(trainee_id, summary, "Unreviewed", event_date, event_time);
    }

    /*Deny Submission*/
    public void denySubmission(EventSubmission submission){
        submission.submission_status = "Denied";
    }

    /*Approve Submission*/
    public void approveSubmission(EventSubmission submission){
        submission.submission_status = "Approved";
        setEvent(submission.submission_event_date, submission.submission_event_time, submission.submission_id, submission.submission_trainee_id, submission.submission_summary);
    }
    /*show submissions functions*/
    public EventSubmission[] getSubmissionList()
    {
        return 0;
    }


}
