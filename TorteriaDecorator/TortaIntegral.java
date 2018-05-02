/**
*@author Edgar Gante
*@version 1
*/
package TorteriaDecorator;
public class TortaIntegral extends Torta {

  public TortaIntegral() {
    descripcion = "Torta Integral";
  }

  public double costo() {
    return 80.00;
  }

  public String toString(){
    return getDescripcion();
  }
}
