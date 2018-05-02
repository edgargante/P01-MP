package TortaBuilder;
import TorteriaDecorator.*;
public class TortaEspecial implements TortaBuilder{

  private Torta t;

  public TortaEspecial(){
  }

  public void buildTorta(){
    this.t = new TortaSimple();{
    this.t = new MilanesaDeRes(t);
    this.t = new QuesoBlanco(t);
    this.t = new QuesoManchego(t);
    this.t = new Mayonesa(t);
    this.t = new Mostaza(t);
    this.t = new Jitomate(t);
    this.t = new Lechuga(t);
  }
  }

  public Torta getTorta(){
    return t;
  }
}
