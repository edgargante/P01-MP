/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SSalchicha extends IngredienteDecorator{

  /**Cosntructor de la clase SSalchicha
  *@param Sandwich sandwich a decorar
  */
  public SSalchicha(Sandwich s){
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
    return sandwich.getDescription() + ", Salchicha";
  }
}
