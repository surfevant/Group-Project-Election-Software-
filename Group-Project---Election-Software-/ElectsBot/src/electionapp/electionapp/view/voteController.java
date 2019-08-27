package electionapp.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class voteController {
	
	@FXML private CheckBox Sen1;
	@FXML private CheckBox Sen2;
	@FXML private CheckBox Sen3;
	@FXML private CheckBox Sen4;
	@FXML private CheckBox NoSen;
	@FXML private CheckBox Rep1;
	@FXML private CheckBox Rep2;
	@FXML private CheckBox Rep3;
	@FXML private CheckBox Rep4;
	@FXML private CheckBox NoRep;
	@FXML private CheckBox Clerk1;
	@FXML private CheckBox Clerk2;
	@FXML private CheckBox Clerk3;
	@FXML private CheckBox Clerk4;
	@FXML private CheckBox NoClerk;
	@FXML private Label SenatorLabel;
	@FXML private Label RepLabel;
	@FXML private Label ClerkLabel;
	
    @FXML
    /*Simple method for closing program*/
    private void exit() {
        Platform.exit();
    }
    
    @FXML
    /*Toggles Full Screen.  May be removed later to prevent users from exiting full screen.*/
    private void vote() {
    	boolean isS1 = Sen1.isSelected();
    	boolean isS2 = Sen2.isSelected();
    	boolean isS3 = Sen3.isSelected();
    	boolean isS4 = Sen4.isSelected();
    	boolean isS5 = NoSen.isSelected();
    	boolean isR1 = Rep1.isSelected();
    	boolean isR2 = Rep2.isSelected();
    	boolean isR3 = Rep3.isSelected();
    	boolean isR4 = Rep4.isSelected();
    	boolean isR5 = NoRep.isSelected();
    	boolean isC1 = Clerk1.isSelected();
    	boolean isC2 = Clerk2.isSelected();
    	boolean isC3 = Clerk3.isSelected();
    	boolean isC4 = Clerk4.isSelected();
    	boolean isC5 = NoClerk.isSelected();
    	boolean SenOK = false;
    	boolean RepOK = false;
    	boolean ClerkOK = false;
    	
    	//Check for single vote for Senator
    	int count = 0;
    	if (isS1) {count += 1;}
    	if (isS2) {count += 1;}
    	if (isS3) {count += 1;}
    	if (isS4) {count += 1;}
    	if (isS5) {count += 1;}
    	System.out.print(count);
    	if(count == 1) {SenOK = true;} 
    	else {
    		// TO DO
    		// Labels not working. Figure out why.
    		//SenatorLabel.setTextFill(Color.web("#FF0000"));
    		//SenatorLabel.setVisible(true);
        }
	
    	//Check for single vote for Representative
    	count = 0;
    	if (isR1) {count += 1;}
    	if (isR2) {count += 1;}
    	if (isR3) {count += 1;}
    	if (isR4) {count += 1;}
    	if (isR5) {count += 1;}
    	System.out.print(count);
    	if(count == 1) {RepOK = true;} 
    	else {
    		//RepresentativeLabel.setTextFill(Color.web("#FF0000"));
    		//RepLabel.setVisible(true);
    		}
	
    	//Check for single vote for Senator
    	count = 0;
    	if (isC1) {count += 1;}
    	if (isC2) {count += 1;}
    	if (isC3) {count += 1;}
    	if (isC4) {count += 1;}
    	if (isC5) {count += 1;}
    	System.out.print(count);
    	if(count == 1) {ClerkOK = true;}
    	else {
    		//ClerkLabel.setTextFill(Color.web("#FF0000"));
    		//ClerkLabel.setVisible(true);
    	}

    	//	TO DO
    	//  
    	//	Allow Voter review
    	//  Collect votes and forward to Election Database
    	//  Update voter status in Registration Database
    	
    	//if(SenOK && RepOK && ClerkOK) {
    	//	System.out.println("Hi");
    	//}
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
