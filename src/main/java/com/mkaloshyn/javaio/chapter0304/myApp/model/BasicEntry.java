package main.java.com.mkaloshyn.javaio.chapter0304.myApp.model;

public class BasicEntry {

    private Long id;
    private String name;
    private ReportStatus reportStatus;

    public BasicEntry(Long id, String name, ReportStatus reportStatus) {
        this.id = id;
        this.name = name;
        this.reportStatus = reportStatus;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ReportStatus getReportStatus() {
        return reportStatus;
    }

}
