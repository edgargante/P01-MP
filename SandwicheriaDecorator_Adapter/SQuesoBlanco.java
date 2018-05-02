/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SQuesoBlanco extends IngredienteDecorator{

  /**Cosntructor de la clase SQuesoBlanco
  *@param Sandwich sandwich a decorar
  */
  public SQuesoBlanco(Sandwich s){
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
    return sandwich.getDescription() + ", Queso blanco";
  }
}
