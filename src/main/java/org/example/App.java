package org.example;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.library.Constans;

import java.io.IOException;

public class App extends Application {

    Stage stage;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/sceneDashboard.fxml"));
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane, 900, 600);

        button = new Button("dialog");
        button.setOnAction(event -> {
            FXMLLoader loaderAuth = new FXMLLoader(this.getClass().getResource("/fxml/dialogAuth.fxml"));
            try {
                BorderPane borderPaneAuth = loaderAuth.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        button.setVisible(true);
        borderPane.getChildren().add(button);

        primaryStage.setScene(scene);
        primaryStage.setTitle(Constans.APP_VERSION + "_dashboard");
        primaryStage.setResizable(true);
        primaryStage.show();
    }


}
