/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SandwichIntegral implements Sandwich{

  /**Cosntructor de la clase SandwichIntegral
  */
  public SandwichIntegral(){
  }

  /**@see documentacion de la clase Sandwich
  */
  public double getCost(){
    return 6;
  }

  /**@see documentacion de la clase Sandwich
  */
  public String getDescription(){
    return "Pan integral ";
  }
  /**@see documentacion de la clase Sandwich
  */
  public String toString(){
    return getDescription() + "CostoTotal :" + getCost();
  }
}
