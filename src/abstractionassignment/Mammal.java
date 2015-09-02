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
public class Mammal implements Animal{
    private boolean breathsAir = true;
    private String name;

    public boolean isBreathsAir() {
        return breathsAir;
    }

    public void setBreathsAir(boolean breathsAir) {
        this.breathsAir = breathsAir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
