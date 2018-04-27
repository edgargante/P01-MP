public class QuesoBlanco extends IngredienteDecorator{

  public QuesoBlanco(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 2;
  }

  public String getDescripcion(){
    return sandwich.getDescripcion() + ", Queso blanco";
  }
}
