package electionapp.election;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CandidateJUnit {
    private Candidate c;
    private String s = "";


    @Before
    public void setUp() throws Exception {
        c = new Candidate(s);
    }

    @Test
    public void testGetUserName(){
        c.addVoteTotal();
        assertEquals(1, c.getVoteTally());
    }


}
