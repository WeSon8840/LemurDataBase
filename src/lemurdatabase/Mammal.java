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
public class Mammal {
  private int itsAge;
  private int itsWeight;
  private boolean gender;
  
  
  public Mammal(){
    //Default Constructor
      itsAge = 0;
      itsWeight = 0;
  }
  
  public int getAge() {
    return itsAge;
  }

  public int getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }
    
  public boolean getGender() {
    return gender;
  }

  public void setMale(boolean theGender) {
    gender = theGender;
  }
  
  public String toString() {
    String output = "";
    if (gender) {
      output += "Gender = Male\n";
    } else {
      output += "Gender = Female\n" + "Female Lemur = Dominant role\n";
    }
    output += "Age = " + itsAge + "\n";
    return output;
  } 
}
