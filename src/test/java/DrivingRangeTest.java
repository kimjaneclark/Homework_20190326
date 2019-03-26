import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrivingRangeTest {

    DrivingRange drivingRange;

    @Before
    public void setup(){
        drivingRange = new DrivingRange(6.50, 40, 100);
    }

    @Test
    public void getCost(){
        assertEquals(6.50, drivingRange.getCost(), 0.01);
    }

    @Test
    public void getCapacity(){
        assertEquals(40, drivingRange.getCapacity());
    }

    @Test
    public void getBucketCapacity(){
        assertEquals(100, drivingRange.getBucketCapacity());
    }



}
