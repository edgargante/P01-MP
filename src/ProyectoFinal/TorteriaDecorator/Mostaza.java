package src.ProyectoFinal;
public class Mostaza extends IngredienteDecoradorTorta {

  Torta torta;

  public Mostaza(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Mostaza";
  }

  public double costo() {
    return 0.50 + torta.costo();
  }
}
