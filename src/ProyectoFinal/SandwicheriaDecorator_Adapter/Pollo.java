public class Pollo extends IngredienteDecorator{

  public Pollo(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 3;
  }

  public String getDescripcion(){
    return sandwich.getDescription() + ", Pollo";
  }
}
