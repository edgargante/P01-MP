public class QuesoDePuerco extends IngredienteDecorator{

  public QuesoDePuerco(Sandwich s){
    super(s);
  }

  public double getPrecio(){
    return sandwich.getPrecio() + 3;
  }

  public String getDescripcion(){
    return sandwich.getDescription() + ", QuesoDePuerco";
  }
}
