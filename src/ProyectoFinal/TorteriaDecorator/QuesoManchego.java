package TorteriaDecorator;
public class QuesoManchego extends IngredienteDecoradorTorta {

  Torta torta;

  public QuesoManchego(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Queso Manchego";
  }

  public double costo() {
    return 22.00 + torta.costo();
  }
}
