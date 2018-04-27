package src.ProyectoFinal;
public class Jitomate extends IngredienteDecorator{

  public Jitomate (Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 2;
  }

  public String getDescripcion(){
    return sandwich.getDescripcion() + ", Jitomate";
  }
}
