package game;

import java.util.*;
import gameobjects.Actor;
import gameobjects.Room;
import globals.Direction;

/**
 *      Game is a class containing the framework to set Variables for each new Instance of the Game.
 *      @author Wayne A. Campbell
 *      @version 1.2 - 4/8/2015
 */
public class Game {
    /*  Creates a ArrayList to hold all the Room objects.
        Creates a player object from the Actor class
        Creates an array to hold boolean values representing items */ 
    private ArrayList map;
    private Actor player;
    boolean[] playerItemArray = new boolean[9];
    
     
    
    /*  Constructor of the class creates:
            1) Fills map ArrayList with the Room objects containing information about the rooms
            2) Sets the starting Room of the actor.
    */
    public Game(){
        this.map = new ArrayList();
            //Room(String aName, String aDescription, int aN, int aS, int aW, int aE, String aLongDescription, int itemNumber)
            map.add(new Room("room0", 
                             "Enterance ",
                                Direction.NOEXIT, Direction.NOEXIT, 2 ,Direction.NOEXIT,
                               "You cannot leave yet! There is so much more to do!"
                                ,0));
            map.add(new Room("room1", 
                             "Enterance ",
                                Direction.NOEXIT, Direction.NOEXIT, 2 ,Direction.NOEXIT,
                                "You cannot leave yet! There is so much more to do!"
                                ,0));
            map.add(new Room("room2", 
                             "Gatehouse", 
                                15,3,18,1,
                                "As you drive up to the gatehouse, and empoyee hails you down saying:\n "
                                        + "'tickets are $5 dollars today, play to drive in and park'\n"
                                        + "He also mentions something about a Jr. Ranger certificate.\n"
                                        + "Visit the library for more details. Sounds interesting. you say.\n"
                                ,2));
            map.add(new Room("room3", 
                             "Potawatomi Inn", 
                                2, 4, Direction.NOEXIT ,8,
                                "You arrive at the Potawatomi Inn, "
                                        + "There is a sign saying 'Lake James' -Boat Rental & Volleyball Courts, South.\n"
                                        + "But you also see a sign telling you of the amazing trails at Potawatomi Nature Preserve, East.\n\n"
                                        + "\n"
                                        + "At the Registration desk, you ask the lady what there is to do today:\n"
                                        + "'If you collect all the items on the trail today, you get a Jr Ranger Badge!'\n"
                                        + "With nothing else to do today, this might sound like a fun idea!\n"
                                ,8));
            map.add(new Room("room4", 
                             "Lake James", 
                                3,5,6,Direction.NOEXIT,
                                "You arrive at the Lake, simpy in awe of the amazing view.\n"
                                        + "Off to the West you see a Volleyball court, I wonder if you can beat anyone?\n"
                                        + "To the South you see the outline of a Boat House on the shore, I wonder if they have any boats to rent\n?"
                                ,0));
            map.add(new Room("room5", 
                             "Boat Rental", 
                                4, Direction.NOEXIT,Direction.NOEXIT ,Direction.NOEXIT,
                                "After talking to the Boat Rental Personal, you find out that it would cost $20 for 1 hour of rental\n"
                                        + "Do you want to rent a boat?\n"
                                        + "The viewpoint of the Lake is to the North\n"
                                ,4));
            map.add(new Room("room6", 
                             "Volleyball Court", 
                                Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, 4,
                                "There we go, you have made it to the voleyball court\n"
                                ,0));
            map.add(new Room("room7", 
                             "Nothing", 
                                Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, 4,
                                "Such Long Description7"
                                ,0));
            map.add(new Room("room8", 
                             "Trail 8", 
                                Direction.NOEXIT, Direction.NOEXIT, 3,9,
                                "You are on the Trail 3, surrounded by tall oak trees\n"
                                        + "The only sound you hear is the leaves crackeling under your feet as you walk\n"
                                        + " Keep heading onward East to the Lake that you see in the distance.\n"
                                ,0));
            map.add(new Room("room9", 
                             "Lake Lonidaw/Trail 6", 
                                Direction.NOEXIT, Direction.NOEXIT, 8,10,
                                "You look at the beautiful lake to the side, wondering what else is on this trail.\n "
                                        + "Walk East to see more of the trail and what it holds.\n"
                                ,3));
            map.add(new Room("room10", 
                             "Potawatomi Nature Preserve", 
                                11, Direction.NOEXIT, 9, Direction.NOEXIT,
                                "This ear is amazing! You see a cattail marsh at far as your eyes can see,\n "
                                        + "With animals you have never seen.\n"
                                        + "You see a sign saying 'Head North to see more trails!'\n"
                                ,1));
            map.add(new Room("room11", 
                             "Intersection", 
                                12,10,15,13,
                                "As you arrive to the intersection, you see 3 new trails in every direction.\n"
                                        + "To the East you see a interesting sign, just saying Old House/Trail 9.\n"
                                        + "To your North, Hells Point. You mutter about that sounding interesting...\n"
                                        + "To your West, Trail 2. But the sign is worn off that tell details, darn.\n"
                                        + "To The Soouth, The Potawatomi Nature Preserve\n"
                                ,0));
            map.add(new Room("room12", 
                             "Hells Point", 
                                Direction.NOEXIT, 11,14, Direction.NOEXIT,
                                "After hiking almost 2.2 miles, are greeted by the view from the highest point in Steuben County.\n"
                                    + "It was definitely worth the hike!\n"
                                    + "There is a Wetlands Display to the West\n"
                                    + "Return to the main intersection by heading South\n"
                                ,0));
            map.add(new Room("room13", 
                             "Trail 9 / Old House", 
                                Direction.NOEXIT, Direction.NOEXIT,11, Direction.NOEXIT,
                                "Along Trail 9 you come across a Old House..... You see something glittering on the trail.\n"
                                        + "Go back West to get back to the intersection\n"
                                ,7));
            map.add(new Room("room14", 
                             "Trail 7 / Wetland", 
                                Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT, 12,
                                "Nothing really here except the birlds trying to live in the the harse wetland habitat\n"
                                ,6));
            map.add(new Room("room15", 
                             "Trai 2 / Spring Shelter", 
                                16,2,Direction.NOEXIT, 11,
                                "This looks like a great place to lie down and camp for a night....\n"
                                        + "There is a sign telling you that Snow Lake is North\n"
                                        + "Head South to go to the GateHouse\n"
                                ,5));
            map.add(new Room("room16", 
                             " Trail 2 / Snow Lake", 
                                Direction.NOEXIT, 15, Direction.NOEXIT, Direction.NOEXIT,
                                "Snow Lake is a popular place for people to go boating and fishing\n"
                                        + "But since it is mostly private, you cannot hike on the rest of this trail\n"
                                        + "Go back South to reach the Youth Camps.\n"
                                ,0));
            map.add(new Room("room17", 
                             "Nothing", 
                                Direction.NOEXIT, 15, Direction.NOEXIT, Direction.NOEXIT,
                                "Such Long Description17"
                                ,0));
            map.add(new Room("room18", 
                             "parking Lot", 
                                Direction.NOEXIT, Direction. NOEXIT, Direction.NOEXIT, 2,
                                "You park your car, very much anxious for the adventure that awaits!\n"
                                        + "Head East to get to the gatehouse\n"
                                ,0));
            
            player = new Actor("player", 
                                "a loveable game-player", (Room) map.get(0));
            
            
    }
    
    /**
    *    Returns the value of map.
    *    @return map, the value of the map in that array
    */
    ArrayList getMap(){
        return map;
    }
    
    /**
    *    Sets the Map to a new map
    *    @param aMap, new map to use.
    *    @return void
    */
    void setMap(ArrayList aMap){
        map = aMap;
    }
    
    /**
    *    Gets the Player Name.
    *    @return player, the Actor that is being used
    */
    public Actor getPlayer() {
        return player;
    }
    
    /**
    *    Sets the player being used
    *    @param aPlayer, new Actor to be used in program
    *    @return void
    */
    public void setPlayer(Actor aPlayer) {
        player = aPlayer;
    }
    
    /**
    *    Moves actor to the specified location
    *    @param p, Actor to be moved
    *    @param aRoom, Room to move into
    *    @return void
    */
    void moveActorTo(Actor p, Room aRoom) {
        p.setRoom(aRoom);
    }
    
    /**
    *    Moves Actor in the Specified location
    *       1) Make sure that the exit of the Room exists
    *       2) Attempt to move in that direction if there is a open spot
    *    @param anActor, Actor to move
    *    @param dir, Direction to move Actor
    *    @return exit, value of room to move into
    */
    int moveTo(Actor anActor, Direction dir) {
        Room r = anActor.getRoom();
        int exit;
        
        switch (dir) {
            case NORTH:
                exit = r.getN();
                break;
            case SOUTH:
                exit = r.getS();
                break;
            case EAST:
                exit = r.getE();
                break;
            case WEST:
                exit = r.getW(); 
                break;
            default:
                exit = Direction.NOEXIT;
                break;
        }
        //if it can move, then move
        if (exit != Direction.NOEXIT) {
            moveActorTo(anActor, (Room) map.get(exit));
        }
        return exit;
    }
    
    /**
    *    Returns statments that are used to handle which buttons are enabled
    *       on the Main program.
    *    1) Check each direction based on param
    *    2) if they direction is a NOEXIT, then return a true
    *    @param checkDirection, char, character of which direction to move into, N, S, W, E
    *    @return Boolean value representing if there is an exit, to activate button.
    */
    public Boolean updateBtn(char checkDirection){
    Room r = player.getRoom();
        if(checkDirection == 'N'){
            if(r.getN() == Direction.NOEXIT){
              return true;
            }
        }
        
        if(checkDirection == 'S'){
            if(r.getS() == Direction.NOEXIT){
              return true;
            }
        }
        
        if(checkDirection == 'E'){
            if(r.getE() == Direction.NOEXIT){
              return true;
            }
        }
        
        if(checkDirection == 'W'){
            if(r.getW() == Direction.NOEXIT){
              return true;
            }
        }
        
        return false;
    }
    
    /**
    *    Moves Actor in the Specified Direction, Runs moveTo();
    *    @param dir, Direction to move Actor
    *    @return moveTo(); value of player moved.
    */
    public int movePlayerTo(Direction dir) {
        return moveTo(player, dir);
    }
    
    /**
    *    Transfers the item from room inventory to Player inventory
    *       1) Sets itemInt to the value of the current rooms item 
    *       2) sets the boolean array playerItemArray[] to true for the respected item
    *       3) removes the item from the Room
    *    @return void
    */
    public void transferItem(){
        Room r = player.getRoom();
        int itemInt = r.getItem();
        
        if(itemInt == 1){
            playerItemArray[1] = true;
            r.removeItem();
        } 
        else if(itemInt == 2){
            playerItemArray[2] = true;
            r.removeItem();
        } 
        else if(itemInt == 3){
            playerItemArray[3] = true;
            r.removeItem();
        } 
        else if(itemInt == 4){
            playerItemArray[4] = true;
            r.removeItem();
        } 
        else if(itemInt == 5) {
            playerItemArray[5] = true;
            r.removeItem();
        } 
        else if(itemInt == 6){
            playerItemArray[6] = true;
            r.removeItem();
        } 
        else if(itemInt == 7){
            playerItemArray[7] = true;
            r.removeItem();
        } 
        else if(itemInt == 8){
            playerItemArray[8] = true;
            r.removeItem();
        } 
        
    }
    
    /**
     * Removes Item from inventory and places it in Room Item set.
     * @param removeID 
     */
    public void removeItem(int removeID){
        Room r = player.getRoom();
        
            playerItemArray[removeID] = false;
            r.setItem(removeID);
    }
    
    /**
     * Checks to see if item passed in is in the player array
     * @param itemID, 1-8 int representing ID of item being searched for
     * @return true,false based on whether you have the item in your array
     */
    public Boolean isItem(int itemID){
        if(playerItemArray[itemID] = true){
            return true;
        }else{
        return false;
        }
    }
    
    /**
    *    Returns a Sting based on the Inventory you own
    *       1) Sets a new String, str
    *       2) Asks if the array is true for that item
    *       3) Adds that item to the String
    *    @return str, the full String containing all the inventory owned
    */
    public String printItemArray(){
        String str = "\n\n" + "Inventory:\n";
        if(playerItemArray[1]){
            str = str + "Pine Cone (1)\n";
        }
        if(playerItemArray[2]){
            str = str + "Parking Receipt (2)\n";
        }
        if(playerItemArray[3]){
            str = str + "Cattail (3)\n";
        }
        if(playerItemArray[4]){
            str = str + "Boat (4)\n";
        }
        if(playerItemArray[5]){
            str = str + "Canteen (5)\n";
        }
        if(playerItemArray[6]){
            str = str + "Bluebird (6)\n";
        }
        if(playerItemArray[7]){
            str = str + "Rusted Key (7)\n";
        }
        if(playerItemArray[8]){
            str = str + "Map (8)\n";
        }
        return str;
    }
    
    /**
    *    Asks if the game can be won
    *       GameWon=All inventory is full with the room items.
    *    @return Boolean, representing if the win condition is true;
    */
    public Boolean winGame(){
        if(playerItemArray[1] &&
           playerItemArray[2] &&
           playerItemArray[3] &&
           playerItemArray[4] &&
           playerItemArray[5] &&
           playerItemArray[6] &&
           playerItemArray[7] &&
           playerItemArray[8]){
            return true;
        }
            return false;
    }
}
