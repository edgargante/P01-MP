public class TortaEspecialQueso{

  private Torta t;

  public TortaEspecialQueso(){
    this.t = new Torta()
  }

  public void buildTorta(){
    this.t = new TortaSimple();{
    this.t = new QuesoManchego(t);
    this.t = new QuesoBlanco(t);
    this.t = new jamon(t);
    this.t = new Mayonesa(t);
    this.t = new Mostaza(t);
    this.t = new Jitomate(t);
    this.t = new Lechuga(t);
  }
  }
}
