package TortaBuilder;
import TorteriaDecorator.*;
public class TortaMilanesaDeRes implements TortaBuilder{

  private Torta t;

  public TortaMilanesaDeRes(){
  }

  public void buildTorta(){
    this.t = new TortaSimple();{
    this.t = new MilanesaDeRes(t);
    this.t = new QuesoManchego(t);
    this.t = new Mayonesa(t);
    this.t = new Lechuga(t);
    this.t = new Jitomate(t);
  }
  }

  public Torta getTorta(){
    return t;
  }
}
