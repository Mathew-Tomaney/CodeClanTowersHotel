import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Fishbowl", 10);
        guest = new Guest("Alan Johnson");
    }
    @Test
    public void hasName(){
        assertEquals("Fishbowl", conferenceRoom.getName());
    }
    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }
    @Test
    public void startsEmpty(){
        assertEquals(0, conferenceRoom.getNumOccupants());
    }
    @Test
    public void canChangeName(){
        conferenceRoom.setName("Johnson");
        assertEquals("Johnson", conferenceRoom.getName());
    }
    @Test
    public void canChangeCapacity(){
        conferenceRoom.setCapacity(12);
        assertEquals(12, conferenceRoom.getCapacity());
    }
    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getNumOccupants());
    }
    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getNumOccupants());
    }
    @Test
    public void canEmptyRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.empty();
        assertEquals(0, conferenceRoom.getNumOccupants());
    }
}
