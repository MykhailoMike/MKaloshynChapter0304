package main.java.com.mkaloshyn.javaio.chapter0304.myApp;

import main.java.com.mkaloshyn.javaio.chapter0304.myApp.model.ReportStatus;
import main.java.com.mkaloshyn.javaio.chapter0304.myApp.view.ReportView;

import java.util.Arrays;
import java.util.Scanner;

public class MyAppMain {

    public static void main(String[] args) {

        ReportView reportView = new ReportView();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("__________________________________\n" +
                    "Please choose the action needed:\n" +
                    "1 - read report by ID;\n" +
                    "2 - read all reports;\n" +
                    "3 - add report;\n" +
                    "4- terminate.");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please put the report's ID:");
                    long i = (long) scanner.nextInt();
                    reportView.getById(i);
                    break;
                case 2:
                    reportView.getAll();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Please put the report's name:");
                    String reportName = scanner.nextLine();
                    System.out.println("Please put one of the possible statuses: " + Arrays.toString(ReportStatus.values()));
                    String repStatus = scanner.nextLine();
                    reportView.save(reportName, repStatus);
                    break;
                case 4:
                    System.out.println("Program has been terminated.");
                    return;
                default:
                    System.out.println("Please choose in range 1 to 4 strictly");
            }

        } while (choice != 4);
    }
}
