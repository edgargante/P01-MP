package src.ProyectoFinal;
public class Mayonesa extends IngredienteDecoradorTorta {

  Torta torta;

  public Mayonesa(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Mayonesa";
  }

  public double costo() {
    return 1.00 + torta.costo();
  }
}
