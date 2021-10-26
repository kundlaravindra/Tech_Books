package witchesandwizards;

public class Sorcerer {
    
    private String name = "";       // name of sorcerer
    
    private double strength = 0.0;  // magical strength of sorcerer
    
    
    // constructor
    // required for inheritance
    public Sorcerer() { }
    
    
    // constructor
    // name is set to value of initName; if the value of initStrength is 
    // strength is set to the value of initStrength, otherwise strength is set
    // to .1
    public Sorcerer(String initName, double initStrength) {
        name = initName;

        if (initStrength > 0)    
            strength = initStrength;
        else
            strength = .1;
    }

    
    // returns value of name
    public String getName() {
        return name;
    }

    
    // returns valuse of strength
    public double getStrength() {
        return strength;
    }

    
    // reduces the strength of the passed sorcerer by half; adds the strength
    // of the passed sorcerer to the calling sorcerer
    public void takeStrength(Sorcerer s) {
        s.strength /= 2;
        strength += s.strength;
    }    
    
}
