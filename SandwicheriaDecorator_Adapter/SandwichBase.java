/**
*@author Bautista Cazares David
*@version 1
*@deprecated sin funcion alguna
*/

package SandwicheriaDecorator_Adapter;
public class SandwichBase implements Sandwich{

  /**@see documentacion de la clase Sandwich
  */
  public double getCost(){
    return 0;
  }

  /**@see documentacion de la clase Sandwich
  */
  public String getDescription(){
    return "";
  }

  /**@see documentacion de la clase Sandwich
  */
  @override
  public String toString(){
    return getDescription() + "CostoTotal :" + getCost();
  }
}
