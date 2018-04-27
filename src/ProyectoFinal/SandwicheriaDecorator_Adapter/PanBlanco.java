public class PanBlanco extends IngredienteDecorator{

  public PanBlanco(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 5;
  }

  public String getDescripcion(){
    return sandwich.getDescripcion() + ", Pan blanco";
  }
}
