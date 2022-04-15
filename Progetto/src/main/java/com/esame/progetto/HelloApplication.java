package com.esame.progetto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Stage stage1 = new Stage();
        stage1.setWidth(400);
        stage1.setHeight(200);
        VBox vBox = new VBox(new Label("A JavaFX label"));
        Scene scene1 = new Scene(vBox);
        stage1.setScene(scene1);
        stage1.setTitle("JavaFX Stage Window Title");
        stage1.setScene(scene1);
        stage1.show();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene2 = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Login");
        stage.setScene(scene2);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}