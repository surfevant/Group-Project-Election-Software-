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

public class registerController {

    @FXML private TextField first;
    @FXML private TextField middle;
    @FXML private TextField last;
    @FXML private TextField street;
    @FXML private TextField city;
    @FXML private TextField zip;
    @FXML private ComboBox<String> MM;
    @FXML private ComboBox<String> DD;
    @FXML private ComboBox<String> YYYY;
    @FXML private TextField dlNum;
    @FXML private ChoiceBox<String> race;
    @FXML private ChoiceBox<String> gender;
    @FXML private ChoiceBox<String> party;
    @FXML private GridPane form;
    @FXML private GridPane loginInfo;
    @FXML private Text username;
    @FXML private Text password;
    @FXML private Label label;

    Registration registration;

    public void initialize(){
        this.registration = new Registration();
        choiceSetup();
    }

    private void choiceSetup(){

        MM.getItems().setAll(FXCollections.observableArrayList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        DD.getItems().setAll(FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"));
        YYYY.getItems().setAll(FXCollections.observableArrayList("1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909",
        		"1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919",
        		"1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929",
        		"1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939",
        		"1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949",
        		"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959",
        		"1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
                "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979",
                "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001"));

        race.setItems(FXCollections.observableArrayList("African American", "Asian", "American Indian", "Multiracial", "White", "Other"));
        gender.setItems(FXCollections.observableArrayList("Male", "Female", "Other"));
        party.setItems(FXCollections.observableArrayList("Democrat", "Republican", "Independent", "Unaffiliated"));
    }

    @FXML
    private void read(){

        String[] userInfo = {first.getText(), middle.getText(), last.getText(), street.getText(), city.getText(), zip.getText(),
                MM.getValue() + "", DD.getValue() + "", YYYY.getValue() + "",
                dlNum.getText(), race.getSelectionModel().getSelectedItem() + "", gender.getSelectionModel().getSelectedItem() + "", party.getSelectionModel().getSelectedItem() + ""};


        if(registration.validateInput(userInfo)){
            User user = new User(userInfo);
            user.storeUserData(userInfo);

            username.setText(user.getUserName());
            password.setText(user.getPassword());

            form.setVisible(false);
            loginInfo.setVisible(true);
        }
        else{
            label.setText("Please fill out all fields.");
            label.setTextFill(Color.web("#FF0000"));

            System.out.print("Please fill out all fields.");
        }
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

