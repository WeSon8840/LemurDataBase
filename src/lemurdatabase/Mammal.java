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
  private double itsWeight;
  private String gender;
//  private boolean gender;
  
  
  public Mammal(){
    //Default Constructor
      itsAge = (int)(Math.random() * 12 + 1);
      itsWeight = (Math.random() * 5 + 1);
      int num = (int)(Math.random() * 2 + 1);
      if (num == 1) {
          gender = "Male";
      }
      else {
          gender = "Female";
      }
  }
  
    /**
     * This method allow the user to set the age of the Mammal
     * pre:needs an age value
     * post:sets the age value
     */
  public int getAge() {
    return itsAge;
  }
  
    /**
     * This method allow the user to set the weight of the Mammal
     * pre:needs an weight value
     * post:sets the weight value
     */
  public double getWeight() {
    return itsWeight;
  }
     
    /**
     * This method allow the user to set the age of the Mammal
     * pre:needs an age value
     * post:sets the age value
     */

  public void setAge(int newAge) {
    itsAge = newAge;
  }
    
    /**
     * This method allow the user to set the weight of the Mammal
     * pre:needs an weight value
     * post:sets the weight value
     */
  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }
  
//  public boolean getGender() {
//    return gender;
//  }
//
//  public void setGender(boolean male) {
//    gender = male;
//  }
  
    /**
     * This method allow the user to random the Gender of the Mammal
     * pre:needs an random gender
     * post:sets the random gender
     */  
  public String getGender(){
      return gender;
  }
  
  //return the output to the main class
  public String toString() {
    String output = "";
    output += "Age = " + itsAge + "\n";
    output += "Weight = " + itsWeight + "\n";
//    if (gender) {
//      output += "Sex: Male\n";
//    } else {
//      output += "Sex: Female\n" + "Female Lemur = Dominant Role\n";
//    }
    output += "Gender = " + gender + "\n";
    
    return output;
  } 
}
