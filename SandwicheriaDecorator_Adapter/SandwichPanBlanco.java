/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SandwichPanBlanco implements Sandwich{

  public SandwichPanBlanco(){
  }

  public double getCost(){
    return 5;
  }

  public String getDescription(){
    return "Pan blanco ";
  }

  public String toString(){
    return getDescription() + "CostoTotal :" + getCost();
  }
}
