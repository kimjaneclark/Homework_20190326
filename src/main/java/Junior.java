public class Junior extends Member implements iPay{

    private String level;

    public Junior(String name, int age, MembershipType member, String level) {
        super(name, age, member);
        this.level = level;

    }


    public String getLevel() {
        return level;
    }

    public String pay(){
        return "Paid £" + getMembershipCost();
    }




}
