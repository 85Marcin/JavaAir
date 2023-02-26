import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Passenger passenger1;

    CabinCrewMember flightAttendent1;


    @Before
    public void setUp() {
        flight = new Flight("FR4456","EDN","GLA","10:00",25, 100);
        pilot1 = new Pilot("Harry", RankType.PILOT, "DEF456");
    }
    @Test
    public void canAddPilot(){
        flight.addPilot(pilot1);
        assertEquals(1, flight.getNumberOfPilots());
    }
    @Test
    public void canAddCrewMember(){
        flight.addCabinCrewMember(flightAttendent1);
        assertEquals(1, flight.getNumberOfCabinCrewMembers());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("FR4456", flight.getFlightNumber());
    }
    @Test
    public void canGetDestination(){
        assertEquals("EDN", flight.getDestination());
    }
    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("10:00", flight.getDepartureTime());
    }
    @Test
    public void canGetTotalWeight(){
        assertEquals(25, flight.getTotalWeight());
    }
    @Test
    public void canGetTotalNumberOfSeats(){
        assertEquals(100, flight.getTotalNumberOfSeats());
    }
    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(100, flight.getNumberOfAvailableSeats());
    }
    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(99, flight.getNumberOfAvailableSeats());
    }
}
