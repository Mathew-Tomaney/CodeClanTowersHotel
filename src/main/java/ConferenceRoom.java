import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private String name;
    private ArrayList<Guest> occupants;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.occupants = new ArrayList<Guest>();
    }

    public int getNumOccupants() {
        return occupants.size();
    }
    public int getCapacity() {
        return capacity;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setCapacity(int newCapacity){
        this.capacity = newCapacity;
    }
    public void addGuest(Guest newGuest){
        this.occupants.add(newGuest);
    }
    public void empty(){
        this.occupants.clear();
    }
    public void removeGuest(Guest guest){
        this.occupants.remove(guest);
    }
}
