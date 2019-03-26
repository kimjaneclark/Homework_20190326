public class Standard extends Member {

    private int handicap;

    public Standard(String name, int age, MembershipType member, int handicap) {
        super(name, age, member);
        this.handicap = handicap;


    }

    public int getHandicap() {
        return handicap;
    }

    public String pay(){
        return "Paid £" + getMembershipCost();
    }
}
