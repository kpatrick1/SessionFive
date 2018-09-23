package us.kpatrick.enums.test;

import us.kpatrick.enums.NFCMascot;

import static org.junit.Assert.*;

public class NFCMascotTest {
    NFCMascot Team = NFCMascot.PAC;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getTeam() {
        assertTrue(Team.getTeam() == "Green Bay Packers");
        assertFalse(Team.getTeam() == "Dallas Cowboys");

    }


}