/**
*@author Bautista Cazares David
*@version 1
*/
package SandwicheriaDecorator_Adapter;
public class SJamon extends IngredienteDecorator{

  /**Cosntructor de la clase SJamon
  *@param Sandwich sandwich a decorar
  */
  public SJamon(Sandwich s){
    super(s);
  }

  /**@see documentacion de la clase Sandwich
  */
  public double getCost(){
    return sandwich.getCost() + 5;
  }

  /**@see documentacion de la clase Sandwich
  */
  public String getDescription(){
    return sandwich.getDescription() + ", Jamon";
  }
}
