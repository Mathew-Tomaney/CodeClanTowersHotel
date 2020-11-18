import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }
    public int getBedroomCount(){
        return this.bedrooms.size();
    }
    public int getConferenceCount(){
        return this.conferenceRooms.size();
    }
    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }
    public void addConference(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }
    public boolean checkRoomBelowCapacity(Bedroom bedroom){
        return bedroom.getNumOccupants() < bedroom.getCapacity();
    }
    public void checkInGuest(Guest guest, Bedroom bedroom){
        if(this.checkRoomBelowCapacity(bedroom)) {
            bedrooms.get(bedrooms.indexOf(bedroom)).addGuest(guest);
        }
    }
    public void checkOutRoom(Bedroom bedroom){
        bedrooms.get(bedrooms.indexOf(bedroom)).empty();
    }

    public ArrayList<Bedroom> getAvailableRooms(){
        ArrayList<Bedroom> results = new ArrayList<Bedroom>();
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getNumOccupants() == 0){
                results.add(bedroom);
            }
        }
        return results;
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

}
