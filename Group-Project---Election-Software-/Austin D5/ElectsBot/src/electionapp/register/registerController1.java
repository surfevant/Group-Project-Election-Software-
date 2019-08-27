package electionapp.register;

import electionapp.User.User;
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

public class registerController1 {

    @FXML private TextField SSN1;
    @FXML private TextField SSN2;
    @FXML private TextField SSN3;
    
    public void initialize(){
    }

    
    private boolean isRegistered() {
    	boolean isRegistered = false;
    	//TO DO Access Database to verify registration
    	//Currently assuming false
    	return isRegistered;
    }
    
    @FXML
    private void read(ActionEvent e) throws Exception{
        String[] userInfo = {SSN1.getText(), SSN2.getText(), SSN3.getText()};

        if(validateInput(userInfo)){
        	if (isRegistered()) {
        		alreadyRegistered(e);
    	    }
    		continueRegistration(e);
            
        }
        else{
        	//TO DO Add Label in Scenebuilder
        	//label.setText("You must have a 9-digit Social Security Number to register.");
            //label.setTextFill(Color.web("#FF0066"));
            System.out.print("You must have a 9-digit Social Security Number to register. ");
        }
    }

    private boolean validateInput(String[] userInfo){
    	
    	boolean isValid; 
    	isValid = false;
    	String SSN = SSN1.getText()+SSN2.getText()+SSN3.getText();
    	String validate = "";
    
    	//Strip all non-digits. Continue if 9.
    	for(char a:SSN.toCharArray()) {
    		if (Character.isDigit(a)){
    			validate += a;
    	    }
    	}
    	
    	if (validate.length() == 9) {
        	isValid = true;
    		}
        return isValid;
    }

    @FXML
    private void returnHome(ActionEvent e) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../menu/menuUI.fxml"));
        Stage menuStage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene log = new Scene(loader.load(), 1280, 720);
        menuStage.setScene(log);
    }
    
    @FXML
    private void continueRegistration(ActionEvent e) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../register/registerUI.fxml"));
        Stage menuStage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        Scene log = new Scene(loader.load(), 1280, 720);
        menuStage.setScene(log);
    }
    
    private void alreadyRegistered(ActionEvent e) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../register/registerUI2.fxml"));
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

