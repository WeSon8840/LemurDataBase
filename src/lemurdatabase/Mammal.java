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
  
  public int getAge() {
    return itsAge;
  }

  public double getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }
  
  public String getGender(){
      return gender;
  }
  
  public String toString() {
    String output = "";
    output += "Age = " + itsAge + "\n";
    output += "Weight = " + itsWeight + "\n";
    output += "Gender = " + gender + "\n";
    
    return output;
  } 
}
