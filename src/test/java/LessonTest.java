import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LessonTest {

    Lesson lesson;

    @Before
    public void setup(){
        lesson = new Lesson(14.40, 5, "1 hour");
    }

    @Test
    public void getCost(){
        assertEquals(14.40, lesson.getCost(), 0.01);
    }

    @Test
    public void getCapacity(){
        assertEquals(5, lesson.getCapacity());
    }

    @Test
    public void getLength(){
        assertEquals("1 hour", lesson.getLength());
    }



}
