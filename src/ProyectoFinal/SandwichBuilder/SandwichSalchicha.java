package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichSalchicha implements SandwichBuilder{

  private Sandwich sandwich;

  public SandwichSalchicha(){
  }

  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SSalchicha(new SQuesoDePuerco(
               new SQuesoBlanco(new SMayonesa(new SJitomate(new SLechuga(new SandwichPanBlanco()))))));
  }

  public Sandwich getSandwich(){
    return sandwich;
  }
}
