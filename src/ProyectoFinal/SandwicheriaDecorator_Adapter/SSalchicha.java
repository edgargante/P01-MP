package SandwicheriaDecorator_Adapter;
public class SSalchicha extends IngredienteDecorator{

  public SSalchicha(Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 3;
  }

  public String getDescription(){
    return sandwich.getDescription() + ", Salchicha";
  }
}
