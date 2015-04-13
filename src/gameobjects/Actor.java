package gameobjects;

/**
 *      Actor is the class containing the Actor to place in rooms
 *      @author Bryce Grey
 *      @version 1.1 - 4/8/2015
 */
public class Actor extends Thing {
    
    private Room room;
    
    public Actor (String aName, String aDescription, Room aRoom) {
        super(aName, aDescription); //int super class
        this.room = aRoom;
    }
    
    public void setRoom (Room aRoom) {
        this.room = aRoom;
    }
    
    public Room getRoom() {
        return this.room;
    }
    
}
