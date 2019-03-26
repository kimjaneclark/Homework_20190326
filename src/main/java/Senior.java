public class Senior extends Member {



    private boolean playsInMedals;

    public Senior(String name, int age, MembershipType member, boolean playsInMedals) {
        super(name, age, member);
        this.playsInMedals = playsInMedals;


    }


    public boolean PlaysInMedals() {
        return playsInMedals;
    }

    public String pay(){
        return "Paid £" + getMembershipCost();
    }
}
