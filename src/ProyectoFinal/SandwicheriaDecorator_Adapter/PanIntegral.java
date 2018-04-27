package src.ProyectoFinal;
public class PanIntegral extends IngredienteDecorator{

  public PanIntegral(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 6;
  }

  public String getDescripcion(){
    return sandwich.getDescripcion() + ", Pan integral";
  }
}
