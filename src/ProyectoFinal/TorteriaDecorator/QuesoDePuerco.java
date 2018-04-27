public class QuesoDePuerco extends IngredienteDecoradorTorta {

  Torta torta;

  public QuesoDePuerco(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Queso de Puerco";
  }

  public double costo() {
    return 42.50 + torta.costo();
  }
}
