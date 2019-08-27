package electionapp.election;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class electionJUnit {

    private Election e;

    @Before
    public void setUp() {
        e = new Election();
    }

    @Test
    public void testOffice(){
        assertEquals("Senator",e.getCandidateList()[0].office);
    }
    @Test
    public void testName(){
        assertEquals("Palpatine",e.getCandidateList()[0].name);
    }
    @Test
    public void testAffiliation(){
        assertEquals("Sith",e.getCandidateList()[0].affiliation);
    }
}
