/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SMayonesa extends IngredienteDecorator{

  /**Cosntructor de la clase Smayonesa
  *@param Sandwich sandwich a decorar
  */
  public SMayonesa(Sandwich s){
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
    return sandwich.getDescription() + ", Mayonesa";
  }
}
