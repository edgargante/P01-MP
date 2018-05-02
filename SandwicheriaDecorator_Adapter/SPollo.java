/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SPollo extends IngredienteDecorator{

  /**Cosntructor de la clase SPollo
  *@param Sandwich sandwich a decorar
  */
  public SPollo(Sandwich s){
    super(s);
  }

  /**@see documentacion de la clase Sandwich
  */
  public double getCost(){
    return sandwich.getCost() + 3;
  }

  /**@see documentacion de la clase Sandwich
  */
  public String getDescription(){
    return sandwich.getDescription() + ", Pollo";
  }
}
