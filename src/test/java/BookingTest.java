import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Lesson lesson;
    DrivingRange drivingRange;

    @Before
    public void before() {
        booking = new Booking(1234);
        lesson = new Lesson(7.0, 10, "45 mins");
        drivingRange= new DrivingRange(4.5, 35, 50);
    }

    @Test
    public void hasBookingRef(){
        assertEquals(1234, booking.getBookingRef());
    }

    @Test
    public void checkBookedFacilitiesStartsEmpty() {
        assertEquals(0, booking.facilityCount());
    }

    @Test
    public void canBookLesson() {
        booking.book(lesson);
        assertEquals(1, booking.facilityCount());
    }

    @Test
    public void canBookDrivingRange() {  //NEW TEST
        booking.book(drivingRange);
        assertEquals(1, booking.facilityCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll(){
        booking.book(lesson);
        booking.book(drivingRange);
        booking.removeAllBookings();
        assertEquals(0, booking.facilityCount());
    }

}
