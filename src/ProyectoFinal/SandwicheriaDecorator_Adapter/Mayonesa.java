package src.ProyectoFinal;
public class Mayonesa extends IngredienteDecorator{

  public Mayonesa(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 2;
  }

  public String getDescripcion(){
    return sandwich.getDescripcion() + ", Mayonesa";
  }
}
