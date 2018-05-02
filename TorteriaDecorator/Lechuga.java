/**
*@author Edgar Gante
*@version 1
*/
package TorteriaDecorator;
public class Lechuga extends IngredienteDecoradorTorta {

  Torta torta;

  public Lechuga(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Lechuga";
  }

  public double costo() {
    return .20 + torta.costo();
  }
}
