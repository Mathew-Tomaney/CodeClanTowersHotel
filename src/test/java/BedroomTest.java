import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "Double");
    }
    @Test
    public void roomHasNumber(){
        assertEquals(1, bedroom.getNumber());
    }
    @Test
    public void roomHasNumber(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void roomHasNumber(){
        assertEquals("Double", bedroom.getType());
    }
}
