package src.ProyectoFinal;
public class Salchicha extends IngredienteDecorator{

  public Salchicha(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 3;
  }

  public String getDescripcion(){
    return sandwich.getDescription() + ", Salchicha";
  }
}
