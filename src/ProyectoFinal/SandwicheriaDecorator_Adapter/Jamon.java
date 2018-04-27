public class Jamon extends IngredienteDecorator{

  public Jamon(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 5;
  }

  public String getDescripcion(){
    return sandwich.getDescripcion() + ", Jamon";
  }
}
