import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelTest {
    private Hotel hotel;
    private Guest guest;
    private Bedroom bedroom;
    private Bedroom testBedroom;
    private ConferenceRoom conferenceRoom;
    private ConferenceRoom testConferenceRoom;


    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest("Graeme Graemeson");
        bedroom = new Bedroom(2, 3, "Single");
        testBedroom = new Bedroom(1, 2, "Double");
        conferenceRoom = new ConferenceRoom("The Tundra", 9);
        testConferenceRoom = new ConferenceRoom("Hopper", 5);
    }
    @Test
    public void canAddBedroom(){
        hotel.addBedroom(testBedroom);
        assertEquals(1, hotel.getBedroomCount());
    }
    @Test
    public void canAddConferenceRoom(){
        hotel.addConference(testConferenceRoom);
        assertEquals(1, hotel.getConferenceCount());
    }
    @Test
    public void canCheckRoomBelowCapacity(){
        hotel.addBedroom(bedroom);
        bedroom.addGuest(guest);
        assertTrue(hotel.checkRoomBelowCapacity(bedroom));
    }
    @Test
    public void canCheckRoomAtCapacity(){
        hotel.addBedroom(bedroom);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(false, hotel.checkRoomBelowCapacity(bedroom));
    }
    @Test
    public void canCheckGuestInToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.checkInGuest(guest, bedroom);
        assertEquals(true, hotel.checkRoomBelowCapacity(bedroom));
    }
    @Test
    public void canCheckGuestOutOfBedroom(){
        hotel.addBedroom(bedroom);
        hotel.checkInGuest(guest, bedroom);
        hotel.checkOutRoom(bedroom);
        assertEquals(0, bedroom.getNumOccupants());
    }
    @Test
    public void canGetAvailableRooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(testBedroom);
        hotel.checkInGuest(guest, bedroom);
        ArrayList<Bedroom> availableRooms = hotel.getAvailableRooms();
        assertEquals(1, availableRooms.size());
    }

}
