import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> occupants;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.occupants = new ArrayList<Guest>();
    }
}
