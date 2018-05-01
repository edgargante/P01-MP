package TorteriaDecorator;
public class Pollo extends IngredienteDecoradorTorta {

  Torta torta;

  public Pollo(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Pollo";
  }

  public double costo() {
    return 12.50 + torta.costo();
  }
}
