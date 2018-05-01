package SandwicheriaDecorator_Adapter;
public class SMayonesa extends IngredienteDecorator{

  public SMayonesa(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 2;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Mayonesa";
  }
}
