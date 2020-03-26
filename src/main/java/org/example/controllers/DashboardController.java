package org.example.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.library.Constans;

import java.io.IOException;

public class DashboardController {

    // fxml variables

    @FXML public void initialize() { }
    @FXML public void exit() {
        Platform.exit();
    }
    @FXML
    public void dialogAddTask() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/dialog-add-task.fxml"));
        try {
           BorderPane borderPane = loader.load();
            Scene scene = new Scene(borderPane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(Constans.APP_VERSION);
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void dialogAddNote() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/dialog-add-note.fxml"));
        try {
            BorderPane stackPane = loader.load();
            Scene scene = new Scene(stackPane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(Constans.APP_VERSION);
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void sceneDashboard() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/scene-dashboard.fxml"));
        try {
            BorderPane stackPane = loader.load();
            Scene scene = new Scene(stackPane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(Constans.APP_VERSION);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void sceneNotepad() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/scene-notepad.fxml"));
        try {
            BorderPane stackPane = loader.load();
            Scene scene = new Scene(stackPane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(Constans.APP_VERSION);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void sceneCalendar() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/scene-calendar.fxml"));
        try {
            BorderPane stackPane = loader.load();
            Scene scene = new Scene(stackPane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(Constans.APP_VERSION);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
