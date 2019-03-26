public abstract class Facility {


    private double cost;
    private int capacity;


    public Facility (double cost, int capacity){
       this.cost = cost;
       this.capacity = capacity;

    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }
}
