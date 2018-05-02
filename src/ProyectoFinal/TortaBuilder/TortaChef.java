package TortaBuilder;
import TorteriaDecorator.*;
public class TortaChef{

  private TortaBuilder tortaBuilder;

  public TortaChef(TortaBuilder tb){
    tortaBuilder = tb;
  }

  public Torta getTorta(){
    return this.tortaBuilder.getTorta();
  }

  public void makeTorta(){
    this.tortaBuilder.buildTorta();
  }
}
