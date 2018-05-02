package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichEspecial implements SandwichBuilder{

  private Sandwich sandwich;

  public SandwichEspecial(){
  }

  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SPollo(new SSalchicha(new SJamon(
               new SQuesoBlanco(new SMayonesa(new SJitomate(
               new SLechuga(new SandwichIntegral())))))));
  }

  public Sandwich getSandwich(){
    return sandwich;
  }
}
