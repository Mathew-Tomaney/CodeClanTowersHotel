import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Guest guest;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest("Graeme Graemeson");
        bedroom = new Bedroom(2, 3, "Single");
        conferenceRoom = new ConferenceRoom("The Tundra", 9);
    }
    @Test
    public void canAddBedroom(){
        hotel.addBedroom();
        assertEquals(1, hotel.getBedroomCount());
    }
    @Test
    public void canAddConferenceRoom(){
        hotel.addConference();
        assertEquals(1, hotel.getConferenceCount());
    }

}
