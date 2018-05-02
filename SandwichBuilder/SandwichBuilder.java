/**
*@author Bautista Cazares David
*@version 1
*/

package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public interface SandwichBuilder{

  /**Metodo que crea un sandwich predefinido, es decir construye un sandwich con una receta
  *que nosotros definimos en ella.
  */
  public void buildSandwich();

  /**Metodo que devuelve el sandwich creado por SandwichBuilder
  *@return Sandwich sandwich preparado
  */
  public Sandwich getSandwich();
}
