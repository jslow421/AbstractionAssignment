/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionassignment;

/**
 *
 * @author John
 */
public class Biped extends Mammal{
    private boolean twoLegs = true;

    public boolean isTwoLegs() {
        return twoLegs;
    }

    public void setTwoLegs(boolean twoLegs) {
        this.twoLegs = twoLegs;
    }
    
    
}
