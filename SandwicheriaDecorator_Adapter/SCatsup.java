/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SCatsup extends IngredienteDecorator{

  /**Cosntructor de la Clase SCatsup
  *@param Sandwich sandwich a decorar
  */
  public SCatsup(Sandwich s){
    super(s);
  }

  /**@see documentacion de la clase Sandwich
  */
  public double getCost(){
    return sandwich.getCost() + 2;
  }
  
  /**@see documentacion de la clase Sandwich
  */
  public String getDescription(){
    return sandwich.getDescription() + ", Catsup";
  }
}
