public class Report {
    private int report_id;
    private String status;
    private String report_category;
    private String report_description;
    /*Date Class for report_date */

    public Report(int report_id, String status, String report_category, String report_description) {
        this.report_id = report_id;
        this.status = status;
        this.report_category = report_category;
        this.report_description = report_description;
    }

    /*Get functions */
    public int getID() {
        return report_id;
    }
    public String getStatus() {
        return status;
    }
    public String getReportCategory() {
        return report_category;
    }
    public String getReportDescription() {
        return report_description;
    }

}