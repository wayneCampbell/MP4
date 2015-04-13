package gameobjects;

/**
 *      Thing is the Master Class of Room and Actor
 *      @author Trevor Smith
 *      @version 1.4 - 4/8/2015
 */
public class Thing {
    
    private String name;
    private String description;
    
    public Thing(String aName, String aDescription) {
        //constructor
        this.name = aName;
        this.description = aDescription;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String aName) {
        this.name = aName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }
}
