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
    public int getNumber(){
        return this.roomNumber;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public String getType(){
        return this.type;
    }
}
