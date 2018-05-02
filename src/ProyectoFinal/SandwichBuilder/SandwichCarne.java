package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichCarne implements SandwichBuilder{

  private Sandwich sandwich;

  public SandwichCarne(){
  }

  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SSalchicha(new SJamon(
               new SMayonesa(new SQuesoBlanco(new SLechuga(new SJitomate(new SandwichPanBlanco()))))));
  }

  public Sandwich getSandwich(){
    return sandwich;
  }
}
