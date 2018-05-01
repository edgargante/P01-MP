package SandwicheriaDecorator_Adapter;
public class PanIntegral extends IngredienteDecorator{

  public PanIntegral(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 6;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Pan integral";
  }
}
