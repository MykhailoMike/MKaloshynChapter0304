package main.java.com.mkaloshyn.javaio.chapter0304.myApp.controller;

import main.java.com.mkaloshyn.javaio.chapter0304.myApp.model.Report;
import main.java.com.mkaloshyn.javaio.chapter0304.myApp.repository.JavaIOReportRepositoryImpl;
import main.java.com.mkaloshyn.javaio.chapter0304.myApp.repository.ReportRepository;

import java.util.List;

public class ReportController {

    private ReportRepository reportRepository = new JavaIOReportRepositoryImpl();


    public void getById(long i) {
        reportRepository.getById(i);
    }


    public List<Report> getAll() {
        return reportRepository.getAll();
    }


    public void save(String reportName, String repStatus) {
        Report report = reportRepository.createReport(reportName, repStatus);
        reportRepository.save(report);
    }
}

