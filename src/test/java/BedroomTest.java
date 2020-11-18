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
    public void roomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void roomHasType(){
        assertEquals("Double", bedroom.getType());
    }
    @Test
    public void canChangeNumber(){
        bedroom.setNumber(101);
        assertEquals(101, bedroom.getNumber());
    }
    @Test
    public void canChangeCapacity(){
        bedroom.setCapacity(4);
        assertEquals(4, bedroom.getCapacity());
    }
    @Test
    public void canChangeType(){
        bedroom.setType("Twin");
    }
}
