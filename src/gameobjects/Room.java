package gameobjects;

/**
 *      Room is a class containing the framework for directions able to move in, description, and itemNumber.
 *      Subclass of Thing
 *      @author Wayne A. Campbell
 *      @version 1.5 - 4/8/2015
 */
public class Room extends Thing {
    /*
        Creats variables for values north, south, west, east
        int ItemNumber: Value of item located in this Room
        String longDescription: Long description of room
        Boolean isFirstTime: Keeps track of wether it is the first time visiting this room
    */
    private int n,s,w,e;
    private int itemNumber;
    private String longDescription; 
    private Boolean isFirstTime = true;
    
    /*  Constructor of the class creates:
            1) superclass of aName and aDescription
            2) sets the allowed directions able to move from this room
            3) itemNumber of the item in this Room
    */
    public Room(String aName, String aDescription, int aN, int aS, int aW, int aE, String aLongDescription, int itemNumber) {
        super(aName, aDescription); //superclass
        this.n = aN;
        this.s = aS;
        this.w = aW;
        this.e = aE;
        this.longDescription = aLongDescription;
        this.itemNumber = itemNumber;
    }
    
    //Accessor Methods
    //North
    public int getN() {
        return n;
    }
    public void setN(int aN) {
        this.n = aN;
    }
    
    //South
    public int getS() {
        return s;
    }
    public void setS(int aS) {
        this.s = aS;
    }
    
    //East
    public int getE() {
        return e;
    }
    public void setE(int aE) {
        this.e = aE;
    }
    //West
    public int getW() {
        return w;
    }
    public void setW(int aW) {
        this.w = aW;
    }
    
    /**
    *    Gets longDescription String
    *    @return longDescription, String containing the long description of the room
    */
    public String getLongDescription(){
        return longDescription;
    }
    
    /**
    *    Gets getFirstTime
    *    @return returns Boolean, containing if this is the first time you have been to this room
    */
    public Boolean getFirstTime(){
        return isFirstTime;
    }
    
    /**
    *    Sets isFirstTime to false after visiting the room once.
    */
    public void setFirstTimeFalse(){
        isFirstTime = false;
    }
    
    /**
    *    Sets a new item in this room
    *    @param  itemValue, item 1-8 representing a item for the room
    *    @return void
    */
    public void setItem( int itemValue ){
        this.itemNumber = itemValue;
    }
    
    /**
    *    Gets longDescription String
    *    @return longDescription, String containing the long description of the room
    */
    public int getItem(){
        return itemNumber;
    }
    
    /**
    *    Removes an Item from the room
    *    @return void
    */
    public void removeItem(){
        this.itemNumber = 0;
    }
    
    /**
    *    Gets Item as String
    *       1) If an item if found, then return the respected String
    *    @return retval, String containing the item in the room
    */
    public String getItemString(){
        int itemInt = getItem();
        String retval = "None";
        if     (itemInt == 1) return "PineCone";
        else if(itemInt == 2) return "Parking receipt";
        else if(itemInt == 3) return "Cattail";
        else if(itemInt == 4) return "Boat";
        else if(itemInt == 5) return "Canteen";
        else if(itemInt == 6) return "Bluebird";
        else if(itemInt == 7) return "Rusted Key";
        else if(itemInt == 8) return "Map";
        
        return retval;
    }
            
}
