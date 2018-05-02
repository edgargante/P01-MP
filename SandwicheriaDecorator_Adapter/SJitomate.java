/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SJitomate extends IngredienteDecorator{

  /**Cosntructor de la clase SJitomate
  *@param Sandwich sandwich a decorar
  */
  public SJitomate (Sandwich s){
    super(s);
  }

  /**@see documentacion de la clase Sandwich
  */
  public double getCost(){
    return sandwich.getCost() + 2;
  }

  /**@see documentacion de la clase Sandwich
  */
  public String getDescripyion(){
    return sandwich.getDescription() + ", Jitomate";
  }
}
