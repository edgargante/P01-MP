/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class SQuesoDePuerco extends IngredienteDecorator{

  /**Cosntructor de la clase SQuesoDePuerco
  *@param Sandwich sandwich a decorar
  */
  public SQuesoDePuerco(Sandwich s){
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
    return sandwich.getDescription() + ", QuesoDePuerco";
  }
}
