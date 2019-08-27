package electionapp.view;

import electionapp.model.User;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.*;

public class registerController2 {


    public void initialize(){
    }

    @FXML
    private void returnHome(ActionEvent e) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("menuUI.fxml"));
        Stage menuStage = (Stage) ((Node)e.getSource()).getScene().getWindow();
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

