package com.app.mefit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class MainController {

    @FXML
    private Button delete;

    @FXML
    private Label description;

    @FXML
    public ImageView image;

    @FXML
    private Button start;

    @FXML
    void Remove(ActionEvent event) {

    }

    @FXML
    void Start(ActionEvent event) {

    }

    @FXML
    void setDecription(MouseEvent event) {

    }

    @FXML
    void setImage(MouseEvent event){
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        File file = chooser.showOpenDialog(new Stage());
        if(file != null) {
            String choose = file.getPath();
            System.out.println("file:"+choose);
            ImageView image = new ImageView();
            image.setImage(new Image(choose));
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Please Select a File");
            /*alert.setContentText("You didn't select a file!");*/
            alert.showAndWait();
        }
    }

}
