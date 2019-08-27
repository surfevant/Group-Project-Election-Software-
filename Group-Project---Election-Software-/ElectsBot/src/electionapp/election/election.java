package electionapp.election;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class election {

    private Candidate[] CandidateList;


    private election(){

        try{
            File file = new File( System.getProperty("user.dir") + File.separator + ("electionConfig.txt") );
            System.out.println( "TEST: " + file.getAbsolutePath() );
            Scanner lineScanner = new Scanner(file);
            Scanner sc = new Scanner(file);

            int count = 0;
            while (lineScanner.hasNextLine() && !lineScanner.nextLine().equals("") ) {
                count++;
            }
            lineScanner.close();

            System.out.println("Line Count: "+count);

            Candidate[] candlist = new Candidate[count];
            //candlist = new Candidate[count];

            int i = 0;
            while(sc.hasNextLine() && (i < count)){

                candlist[i] = new Candidate( sc.nextLine() );

                i++;
            }

            this.CandidateList = candlist;

            sc.close();

        }

        catch(FileNotFoundException e){
            e.printStackTrace();
        }



    }

    public static void main(String args[]){

        election E = new election();
        System.out.println(E.CandidateList[0].office);
        System.out.println(E.CandidateList[0].name);
        System.out.println(E.CandidateList[0].affiliation);



    }
}