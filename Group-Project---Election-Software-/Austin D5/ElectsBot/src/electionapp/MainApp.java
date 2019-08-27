package electionapp;

import electionapp.register.registerController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class MainApp extends Application {

    private FXMLLoader loader = new FXMLLoader();


    @Override
    public void start(Stage menuStage) throws Exception{

        loader.setLocation(getClass().getResource("menu/menuUI.fxml"));
        Scene scene = new Scene(loader.load(), 1280, 720);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        editMenuStage(menuStage);
        menuStage.setScene(scene);
        menuStage.show();

    }

    /*Separated menuStage details from start.*/
    private void editMenuStage(Stage menuStage){
        menuStage.setTitle("Elects Bot 360");
        menuStage.setMinWidth(300);
        menuStage.setMinHeight(520);
    }


    public static void main(String[] args) {
    	launch(args);
    }
}

