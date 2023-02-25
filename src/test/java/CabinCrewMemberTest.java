import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember1;

    @Before
    public void setUp() {
        cabinCrewMember1 = new CabinCrewMember("Jackie", RankType.FLIGHTATTENDENT );
    }
    @Test
    public void canGetName(){
        assertEquals("Jackie", cabinCrewMember1.getName());
    }
    @Test
    public void canGetRank(){
        assertEquals(RankType.FLIGHTATTENDENT, cabinCrewMember1.getRank());
    }
    @Test
    public void canRelayMessages(){
        assertEquals("Welcome aboard", cabinCrewMember1.relayMessage());
    }
}
