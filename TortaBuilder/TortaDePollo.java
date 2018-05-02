public class TortaDePollo{

  private Torta t;

  public TortaDePollo(){
    this.t = new Torta();
  }

  public void buildTorta(){
    this.t = new TortaSimple();{
    this.t = new Pollo(t);
    this.t = new QuesoBlanco(t);
    this.t = new Mayonesa(t);
    this.t = new Mostaza(t);
    this.t = new Jitomate(t);
    this.t = new Lechuga(t);
  }
  }
}
