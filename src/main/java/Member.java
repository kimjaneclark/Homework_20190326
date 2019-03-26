public abstract class Member {

    private String name;
    private int age;
    private MembershipType membership;

    public Member(String name, int age, MembershipType membership){
        this.name = name;
        this.age = age;
        this.membership = membership;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MembershipType getMembership() {
        return membership;
    }

    public double getMembershipCost(){
        return membership.getCost();
    }
}
