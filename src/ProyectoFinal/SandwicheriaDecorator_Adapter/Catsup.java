package src.ProyectoFinal;
public class Catsup extends IngredienteDecorator{

  public Catsup(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 2;
  }

  public String getDescripcion(){
    return sandwich.getDescription() + ", Catsup";
  }
}
