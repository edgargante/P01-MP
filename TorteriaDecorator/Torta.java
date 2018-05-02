/**
*@author Edgar Gante
*@version 1
*/
package TorteriaDecorator;
public abstract class Torta {

  String descripcion = "Torta no identificada.";

  public String getDescripcion() {
    return descripcion;
  }

  public abstract double costo();

  public String toString(){
    return getDescripcion() + " Precio total :" + costo();
  }
}
