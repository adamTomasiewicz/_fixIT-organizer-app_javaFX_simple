package org.example.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import lombok.Data;


public class CalendarController {

    DashboardController dashboardController = new DashboardController();

    @FXML
    public void initialize() { }
    @FXML public void exit() {
        Platform.exit();
    }

    public DashboardController getDashboardController() {
        return dashboardController;
    }

    public static void main(String[] args){
    }

}
