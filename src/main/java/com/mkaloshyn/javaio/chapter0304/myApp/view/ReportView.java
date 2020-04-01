package main.java.com.mkaloshyn.javaio.chapter0304.myApp.view;

import main.java.com.mkaloshyn.javaio.chapter0304.myApp.controller.ReportController;

public class ReportView {

    private ReportController reportController = new ReportController();

    public void getById(long i) {
        reportController.getById(i);
    }

    public void getAll() {
        reportController.getAll();
    }

    public void save(String reportName, String repStatus) {
        reportController.save(reportName, repStatus);
    }
}
