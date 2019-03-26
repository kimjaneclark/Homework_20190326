import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeniorTest {



    Senior senior;

    @Before
    public void setup(){
        senior = new Senior("Wallace", 73, MembershipType.SENIOR, true);
    }

    @Test
    public void getName(){
        assertEquals("Wallace", senior.getName());
    }

    @Test
    public void getAge(){
        assertEquals(73, senior.getAge());
    }

    @Test
    public void getMembershipCost(){
        assertEquals(200, senior.getMembershipCost(), 0.01);
    }

    @Test
    public void getIfPlaysInMedals(){
        assertEquals(true, senior.PlaysInMedals());
    }

    @Test
    public void pay(){
        assertEquals("Paid £200.0", senior.pay());
    }

}
