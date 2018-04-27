package src.ProyectoFinal;
public class Lechuga extends IngredienteDecorator{

  public Lechuga(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 2;
  }

  public String getDescripcion(){
    return sandwich.getDescription() + ", Lechuga";
  }
}
