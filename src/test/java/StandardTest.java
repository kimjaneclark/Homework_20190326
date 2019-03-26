import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandardTest {
    Standard standard;

    @Before
    public void setup(){
        standard = new Standard("Ken", 43, MembershipType.STANDARD, 18);
    }

    @Test
    public void getName(){
        assertEquals("Ken", standard.getName());
    }

    @Test
    public void getAge(){
        assertEquals(43, standard.getAge());
    }

    @Test
    public void getMembershipCost(){
        assertEquals(300, standard.getMembershipCost(), 0.01);
    }

    @Test
    public void getHandicap(){
        assertEquals(18, standard.getHandicap());
    }

    @Test
    public void pay(){
        assertEquals("Paid £300.0", standard.pay());
    }

}
