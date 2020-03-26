package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.example.library.Constans;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/scene-dashboard.fxml"));
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane, 900, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle(Constans.APP_VERSION);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
}
