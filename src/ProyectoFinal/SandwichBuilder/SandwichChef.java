package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichChef{

  private SandwichBuilder sandwichBuilder;

  public SandwichChef(SandwichBuilder sb){
    sandwichBuilder = sb;
  }

  public Sandwich getSandwich(){
    return this.sandwichBuilder.getSandwich();
  }

  public void makeSandwich(){
    this.sandwichBuilder.buildSandwich();
  }
}
