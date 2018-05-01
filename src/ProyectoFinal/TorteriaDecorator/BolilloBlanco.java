package TorteriaDecorator;
public class BolilloBlanco extends IngredienteDecoradorTorta {

  Torta torta;

  public BolilloBlanco(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Bolillo Blanco";
  }

  public double costo() {
    return 1.50 + torta.costo();
  }
}
