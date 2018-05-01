package SandwicheriaDecorator_Adapter;
public class SCatsup extends IngredienteDecorator{

  public SCatsup(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 2;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Catsup";
  }
}
