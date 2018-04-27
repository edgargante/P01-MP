package src.ProyectoFinal;
public class Jitomate extends IngredienteDecoradorTorta {

  Torta torta;

  public Jitomate(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Jitomate";
  }

  public double costo() {
    return 2.50 + torta.costo();
  }
}
