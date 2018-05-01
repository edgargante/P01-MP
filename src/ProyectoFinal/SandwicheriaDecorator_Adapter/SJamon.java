package SandwicheriaDecorator_Adapter;
public class SJamon extends IngredienteDecorator{

  public SJamon(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 5;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Jamon";
  }
}
