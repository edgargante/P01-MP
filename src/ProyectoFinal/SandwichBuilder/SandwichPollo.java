package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichPollo implements SandwichBuilder{

  private Sandwich sandwich;

  public SandwichPollo(){
  }

  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SPollo(new SMayonesa(new SQuesoBlanco(new SJitomate(new SLechuga(new SandwichPanBlanco())))));
  }

  public Sandwich getSandwich(){
    return sandwich;
  }
}
