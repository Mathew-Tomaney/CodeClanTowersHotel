import java.util.ArrayList;

public class DiningRoom {
    private ArrayList<Guest> diners;
    private String name;

    public DiningRoom(String name){
        this.name = name;
        this.diners = new ArrayList<Guest>();
    }

    public void addDiner(Guest guest){
        diners.add(guest);
    }

    public String getName(){
        return this.name;
    }
}
