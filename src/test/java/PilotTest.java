import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;

    @Before
    public void setUp(){
        pilot1 = new Pilot("George", RankType.PILOT, "ABC123");
    }
    @Test
    public void canGetName(){
        assertEquals("George", pilot1.getName());
    }
    @Test
    public void canGetRank(){
        assertEquals(RankType.PILOT, pilot1.getRank());
    }
    @Test
    public void canGetLicence(){
        assertEquals("ABC123", pilot1.getLicence());
    }
    @Test
    public void canFly(){
        assertEquals("I'm flying the plane", pilot1.fly());
    }

}
