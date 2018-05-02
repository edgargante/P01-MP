public class TortaDejamon{

  private Torta t;

  public TortaDeJamon(){
    this.t = new Torta();
  }

  public void buildTorta(){
    this.t = new TortaSimple();{
    this.t = new Jamon(t);
    this.t = new QuesoDePuerco(t);
    this.t = new QuesoBlanco(t);
    this.t = new Mayonesa(t);
    this.t = new Jitomate(t);
    this.t = new Lechuga(t);
  }
  }
}
