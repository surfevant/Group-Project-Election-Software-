package electionapp.view;

import electionapp.MainApp;
import electionapp.model.User;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class loginController {


    @FXML private TextField inputName;
    @FXML private TextField inputPass;
    @FXML private GridPane login;
    @FXML private Label error;

    @FXML
    /*Verifies User Login Information*/
    private void verify(ActionEvent e) throws Exception {

        String name = inputName.getText();
        String pass = inputPass.getText();

        try {
            Scanner reader = new Scanner(new File(name + ".txt"));
            String[] userInfo = new String[13];
            int i = 0;

            while (reader.hasNextLine()){
                userInfo[i] = reader.nextLine();
                i++;
            }

            reader.close();
            System.out.println("File Found");

            User u = new User(userInfo);

            if(pass.equals(u.getPassword())){
                castVote(e);
            }
            else{
                error.setText("Incorrect Password.");
                error.setVisible(true);
            }
        }

        catch (FileNotFoundException f) {
            System.out.println("File Not Found");
            error.setText("That user could not be found.");
            error.setVisible(true);
        }

    }

    @FXML
    private void castVote(ActionEvent e) throws Exception{
    	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("voteUI.fxml"));
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
