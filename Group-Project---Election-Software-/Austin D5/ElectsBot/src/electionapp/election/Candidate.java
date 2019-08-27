package electionapp.election;

class Candidate {

    //private String electionID;
    String office;
    String name;
    String affiliation;
    private int voteTally = 0;

    Candidate(String candidateData) {

        String[] candList = candidateData.split("\t");

        this.office = candList[0];
        this.name = candList[1];
        this.affiliation = candList[2];

    }

    public void addVoteTotal(){
        this.voteTally += 1;
    }

    public int getVoteTally() {
        return voteTally;
    }
}
