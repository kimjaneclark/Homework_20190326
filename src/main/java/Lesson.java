public class Lesson extends Facility implements iBook {

    private String length;

    public Lesson (double cost, int capacity, String length) {
        super(cost, capacity);
        this.length = length;

    }

    public String getLength() {
        return length;
    }

    public String book(String data){
        return data + "booked";
    }


}
