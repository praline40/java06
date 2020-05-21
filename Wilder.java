import java.util.*;


public class Wilder {

    // attributes
    private String firstName;
    private boolean aware;
     

    // constructors
    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }
 
 
     // getters
    public String getFirstName() {
        return this.firstName;
    } 
         
    public boolean isAware() {
        return this.aware;
    }
      
    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setAware(boolean aware) {
        this.aware = aware;
    }
   
 
    // static method
    public String whoAmI() {
      if (aware)
      {
        return "Je m'appelle "+this.firstName+" et je suis aware."  ;
      }
      else
      {
         return "Je m'appelle "+this.firstName+" et je ne suis pas aware.";
      }
        
    }
 
}