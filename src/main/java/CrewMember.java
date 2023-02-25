public abstract class CrewMember extends Person {
    private RankType rank;

    public CrewMember (String name, RankType rank) {
        super(name);
        this.rank = rank;
    }
    public RankType getRank(){
        return this.rank;

    }
}
