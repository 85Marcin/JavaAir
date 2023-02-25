public class CabinCrewMember extends CrewMember {

    public CabinCrewMember(String name, RankType rank){
        super(name, rank);
    }
    public String relayMessage(){
        return "Welcome aboard";
    }
}
