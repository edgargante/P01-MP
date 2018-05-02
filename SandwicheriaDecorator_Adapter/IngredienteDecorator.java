/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public class IngredienteDecorator implements Sandwich{

  protected Sandwich sandwich;

  /**Cosntructor de la clase IngredienteDecorator
  *@param Sandwich Sandwich a decorar
  */
  public IngredienteDecorator(Sandwich s){
    sandwich = s;
  }
  /**devuelve el precio total del sandwich
  *@return double precio total del sandwich
  */
  public double getCost(){
    return sandwich.getCost();
  }
  /**@see toString Clase Sandwich
  *@return String 
  */
  public String getDescription(){
    return sandwich.getDescription();
  }

}
