public class Pilot extends CrewMember{

    private String licence;

    public Pilot(String name, RankType rank, String licence){
        super(name, rank);
        this.licence = licence;
    }
    public String getLicence (){
        return this.licence;
    }
    public String fly(){
        return "I'm flying the plane";
    }

}
