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
public class JungleLemur extends Lemur {
    String food = "Mice, Snails, and Insects";
    String colour = "Black or Blue";
    String packSize = "Small groups";

    //return the output base on the super class.
    public String toString() {
        String output = "Jungle Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\n";
        output += "Colour = " + colour + "\n";
        output += "Pack Size = " + packSize + "\n";
        return output;
    }
}
