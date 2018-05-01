package SandwicheriaDecorator_Adapter;
public class SJitomate extends IngredienteDecorator{

  public SJitomate (Sandwich s){
    super(s);
  }

  public double getCost(){
    return sandwich.getCost() + 2;
  }

  public String getDescripyion(){
    return sandwich.getDescription() + ", Jitomate";
  }
}
