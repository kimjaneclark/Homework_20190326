public enum MembershipType {
    JUNIOR(100.00),
    SENIOR(200.00),
    STANDARD(300.00);

    private final double cost;

    MembershipType(double cost){
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
