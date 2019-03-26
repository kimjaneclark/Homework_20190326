public class DrivingRange extends Facility implements iBook {

    private int bucketCapacity;

    public DrivingRange(double cost, int capacity, int bucketCapacity) {
        super(cost, capacity);
        this.bucketCapacity = bucketCapacity;

    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public String book(String data){
        return data + "booked";
    }
}
