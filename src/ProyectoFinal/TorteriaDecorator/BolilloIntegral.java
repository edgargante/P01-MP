package src.ProyectoFinal;
public class BolilloIntegral extends IngredienteDecoradorTorta {

  Torta torta;

  public BolilloIntegral(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Bolillo Integral";
  }

  public double costo() {
    return 2.50 + torta.costo();
  }
}
