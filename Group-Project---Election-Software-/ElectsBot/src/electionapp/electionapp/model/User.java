package electionapp.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class User {

    private String name;
    private String address;
    private String age;
    private String dlNum;
    private String race;
    private String gender;
    private String party;
    private String file;
    private String userName;
    private String password;
    public boolean hasVoted = false;

    public User(String[] userInfo){
        this.name = userInfo[0] + " " + userInfo[1] + " " +  userInfo[2];
        this.address = userInfo[3] + " " + userInfo[4] + " " +  userInfo[5];
        this.age = userInfo[6] + " " + userInfo[7] + " " +  userInfo[8];
        this.dlNum = userInfo[9];
        this.race = userInfo[10];
        this.gender = userInfo[11];
        this.party = userInfo[12];
        this.userName = userInfo[2] + userInfo[0];
        this.file =  this.userName + ".txt";
        this.password = userInfo[0].substring(0,1)+userInfo[1].substring(0,1)+userInfo[2].substring(0,1);
    }

    public void storeUserData(String[] userInfo){
        try {
            FileWriter w = new FileWriter(file);

            for(String s : userInfo) {
                w.write(s + "\r\n");
            }
            w.close();
            System.out.println("File written to " + file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
}
