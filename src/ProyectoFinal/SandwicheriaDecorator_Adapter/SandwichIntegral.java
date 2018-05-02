package SandwicheriaDecorator_Adapter;
public class SandwichIntegral implements Sandwich{

  public SandwichIntegral(){
  }

  public double getCost(){
    return 6;
  }

  public String getDescription(){
    return "Pan integral ";
  }

  public String toString(){
    return getDescription() + "CostoTotal :" + getCost();
  }
}
