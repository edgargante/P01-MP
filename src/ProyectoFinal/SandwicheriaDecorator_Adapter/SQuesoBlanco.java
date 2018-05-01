package SandwicheriaDecorator_Adapter;
public class SQuesoBlanco extends IngredienteDecorator{

  public SQuesoBlanco(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 2;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Queso blanco";
  }
}
