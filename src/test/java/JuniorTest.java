import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JuniorTest {

    Junior junior;

    @Before
    public void setup(){
        junior = new Junior("Fraser", 8, MembershipType.JUNIOR, "Birdie");
    }

    @Test
    public void getName(){
        assertEquals("Fraser", junior.getName());
    }

    @Test
    public void getAge(){
        assertEquals(8, junior.getAge());
    }

    @Test
    public void getMembershipCost(){
        assertEquals(100, junior.getMembershipCost(), 0.01);
    }

    @Test
    public void getLevel(){
        assertEquals("Birdie", junior.getLevel());
    }

    @Test
    public void pay(){
        assertEquals("Paid £100.0", junior.pay());
    }


}
