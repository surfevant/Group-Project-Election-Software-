package com.csci360.electionapp.view;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.*;

public class MenuController {

	@FXML
    private void goRegister(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/Register/RegisterForm.fxml"));
        Stage menuStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        //Parent r = FXMLLoader.load(getClass().getResource("view/LogIn/LoginForm.fxml"));
        Scene log = new Scene(loader.load(), 1280, 720);
        menuStage.setScene(log);

    }

    @FXML
    private void goLogin(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/LogIn/LoginForm.fxml"));
        Stage menuStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        //Parent r = FXMLLoader.load(getClass().getResource("view/LogIn/LoginForm.fxml"));
        Scene log = new Scene(loader.load(), 1280, 720);
        menuStage.setScene(log);

    }

    @FXML
    /*Simple method for closing program*/
    private void exit() {
        Platform.exit();
    }


    @FXML
    /*Toggles Full Screen.  May be removed later to prevent users from exiting full screen.*/
    private void fullScreen(ActionEvent event) {

        Stage menuStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        menuStage.setFullScreenExitHint("");
        if (!menuStage.isFullScreen()){
            menuStage.setFullScreen(true);
        }
        else{
            menuStage.setFullScreen(false);
        }

    }

}
