public class TortaSuprema{

  private Torta t;

  public TortaSuprema(){
    this.t = new Torta();
  }

  public void buildTorta(){
    this.t = new TortaSimple();{
    this.t = new Pollo(t);
    this.t = new MilanesaDeRes(t);
    this.t = new Jamon(t);
    this.t = new QuesoBlanco(t);
    this.t = new QuesoManchego(t);
    this.t = new Mayonesa(t);
    this.t = new Mostaza(t);
    this.t = new Jitomate(t);
    this.t = new Lechuga(t);
  }
  }
}
