public class MilanesaDeRes extends IngredienteDecoradorTorta {

  Torta torta;

  public MilanesaDeRes(Torta torta) {
    this.torta = torta;
  }

  public String getDescripcion() {
    return torta.getDescripcion() + ", Milanesa De Res";
  }

  public double costo() {
    return 32.50 + torta.costo();
  }
}
