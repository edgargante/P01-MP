package src.ProyectoFinal;
public class QuesoBlanco extends IngredienteDecoradorTorta {

  Torta torta;

  public QuesoBlanco(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Queso Blanco";
  }

  public double costo() {
    return 32.00 + torta.costo();
  }
}
