/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author glSon8840
 */
public class TreeLemur extends Lemur {
    String Food = "Fruit";
    String Colour = "Red";
    String packSize = "Large Group";
    
    public String toString(){
        String output = "Tree Lemur\n" + super.toString() + "\n";
        output += "Food = " + Food + "\n";
        output += "Colour = " + Colour + "\n";
        output += "Pack Size = " + packSize + "\n";
        return output;
    }
}
