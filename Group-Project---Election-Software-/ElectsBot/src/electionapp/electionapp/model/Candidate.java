package electionapp.model;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

class Candidate {

    //private String electionID;
    String office;
    String name;
    String affiliation;

    Candidate(String candidateData) {

        String[] candList = candidateData.split("\t");

        this.office = candList[0];
        this.name = candList[1];
        this.affiliation = candList[2];

        //System.out.println(office);
        //System.out.println(name);
        //System.out.println(affiliation);


    }


}
