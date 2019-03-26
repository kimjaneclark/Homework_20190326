import java.util.ArrayList;

public class Booking {


    private int bookingRef;
    private ArrayList<iBook> bookedFacilities;



    public Booking(int bookingRef){
        this.bookingRef = bookingRef;
        this.bookedFacilities = new ArrayList<iBook>();
    }

    public int getBookingRef() {
        return bookingRef;
    }

    public int facilityCount(){
        return bookedFacilities.size();
    }


    public void book(iBook facility){
        bookedFacilities.add(facility);
    }


    public void removeAllBookings(){
        bookedFacilities.clear();

    }
}
