package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichJamon implements SandwichBuilder{

  private Sandwich sandwich;

  public SandwichJamon(){
  }

  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SJamon(new SQuesoBlanco(new SQuesoDePuerco(
               new SJitomate(new SJitomate(new SandwichIntegral())))));
  }

  public Sandwich getSandwich(){
    return sandwich;
  }
}
