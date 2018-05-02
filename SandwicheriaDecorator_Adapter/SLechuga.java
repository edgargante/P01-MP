/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SLechuga extends IngredienteDecorator{

  /**Cosntructor de la clase SLechuga
  *@param Sandwich sandwich a decorar
  */
  public SLechuga(Sandwich s){
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
    return sandwich.getDescription() + ", Lechuga";
  }
}
