package main.java.com.mkaloshyn.javaio.chapter0304.myApp.model;

public class Report extends BasicEntry {

    public Report(Long id, String name, ReportStatus reportStatus) {
        super(id, name, reportStatus);
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportID=" + getId() +
                ", reportName='" + getName() + '\'' +
                ", reportStatus=" + getReportStatus() +
                '}';
    }
}
