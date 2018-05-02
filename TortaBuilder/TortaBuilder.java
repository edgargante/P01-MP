/**
*@author Bautista Cazares David
*@version 1
*/
package TortaBuilder;
import TorteriaDecorator.*;
public interface TortaBuilder{

  /**Metodo que crea una torta predefinido, es decir construye una torta con una receta
  *que nosotros definimos en ella.
  */
  public void buildTorta();

  /**Metodo que devuelve la torta creada por TortaBuilder
  *@return Torta preparada
  */
  public Torta getTorta();
}
