package SandwicheriaDecorator_Adapter;
public class IngredienteDecorator implements Sandwich{

  protected Sandwich sandwich;

  public IngredienteDecorator(Sandwich s){
    sandwich = s;
  }

  public double getCost(){
    return sandwich.getCost();
  }

  public String getDescription(){
    return sandwich.getDescription();
  }

}
