package SandwicheriaDecorator_Adapter;
public class SPollo extends IngredienteDecorator{

  public SPollo(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 3;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Pollo";
  }
}
