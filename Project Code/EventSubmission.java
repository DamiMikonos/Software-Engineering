public class EventSubmission {
    private int submission_id;
    private int submission_trainee_id;
    private String submission_summary;
    private String submission_status;
    /*Dates */

    public EventSubmission(int submission_id, int submission_trainee_id, String submission_summary, String submission_status){
        this.submission_id = submission_id;
        this.submission_trainee_id = submission_trainee_id;
        this.submission_summary = submission_summary;
        this.submission_status = submission_status;
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
}
