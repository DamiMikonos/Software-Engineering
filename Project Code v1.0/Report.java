import java.time.LocalDate;

public class Report {
    private int reportId;
    private String status;
    private String reportCategory;
    private String reportDescription;
    private LocalDate reportDate;

    public Report(int reportId, String status, String reportCategory, String reportDescription, LocalDate reportDate) {
        this.reportId = reportId;
        this.status = status;
        this.reportCategory = reportCategory;
        this.reportDescription = reportDescription;
        this.reportDate = reportDate;
    }

    public int getReportId() {
        return reportId;
    }

    public String getStatus() {
        return status;
    }

    public String getReportCategory() {
        return reportCategory;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
        
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

