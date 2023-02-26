import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalNumberOfSeats;
    private int numberOfAvailableOfSeats;

    private int totalWeightAllowance;
   private ArrayList<Pilot>pilots;
   private ArrayList<CabinCrewMember> cabinCrewMembers;
   private ArrayList<Passenger> passengers;


   public Flight(String flightNumber, String destination, String departureAirport, String departureTime, int totalWeightAllowance, int totalNumberOfSeats){
       this.pilots = new ArrayList<Pilot>();
       this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
       this.passengers = new ArrayList<Passenger>();
       this.flightNumber = flightNumber;
       this.destination = destination;
       this.departureAirport = departureAirport;
       this.departureTime = departureTime;
       this.totalWeightAllowance = totalWeightAllowance;
       this.totalNumberOfSeats = totalNumberOfSeats;
       this.numberOfAvailableOfSeats = totalNumberOfSeats;
   }

   public int getNumberOfPilots(){
       return this.pilots.size();
   }
   public int getNumberOfCabinCrewMembers(){
       return this.cabinCrewMembers.size();
   }

   public void addPilot(Pilot pilot){
       this.pilots.add(pilot);
   }
   public void addCabinCrewMember(CabinCrewMember flightAttendent){
       this.cabinCrewMembers.add(flightAttendent);
   }
   public String getFlightNumber(){
       return this.flightNumber;
   }
   public String getDestination(){
       return this.destination;
   }

    public String getDepartureAirport() {
       return this.departureAirport;
    }
    public String getDepartureTime(){
       return this.departureTime;
    }

    public int getTotalWeight() {
       return this.totalWeightAllowance;
    }
    public int getTotalNumberOfSeats(){
       return this.totalNumberOfSeats;
    }
    public int getNumberOfAvailableSeats(){
       return this.numberOfAvailableOfSeats;
    }
    public void bookPassenger(Passenger passenger){
       if(this.numberOfAvailableOfSeats>0){
           this.passengers.add(passenger);
           this.numberOfAvailableOfSeats--;
       }
    }
}
