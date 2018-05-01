package SandwicheriaDecorator_Adapter;
public class SLechuga extends IngredienteDecorator{

  public SLechuga(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 2;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Lechuga";
  }
}
