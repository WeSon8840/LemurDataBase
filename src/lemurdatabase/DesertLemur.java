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
public class DesertLemur extends Lemur {
    String food = "Cacti";
    String colour = "White";
    double babyDeathRate = 0.66;

    //return the output base on the super class.
    public String toString() {
        String output = "Desert Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\n";
        output += "Colour = " + colour + "\n";
        output += "Baby Death Rate = " + babyDeathRate + "\n";
        return output;
    }
}
