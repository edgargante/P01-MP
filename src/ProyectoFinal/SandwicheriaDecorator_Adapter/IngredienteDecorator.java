package src.ProyectoFinal;
public class IngredienteDecorator implements Sandwich{

  protected Sandwich sandwich;

  public IngredienteDecorator(Sandwich s){
    sandwich = s;
  }

  public double getPrecio(){
    return sandwich.getPrecio();
  }

  public String getDescripcion(){
    return sandwich.getDescripcion();
  }

}
