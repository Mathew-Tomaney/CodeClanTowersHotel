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
}
