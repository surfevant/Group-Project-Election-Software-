package electionapp.User;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserJUnit {
    private User u;
    private String[] s = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"} ;


    @Before
    public void setUp() throws Exception {
        u = new User(s);
    }

    @Test
    public void testGetUserName(){
        assertEquals("31", u.getUserName());
    }

    @Test
    public void testGetPassword(){
        assertEquals("123", u.getPassword());
    }

}
