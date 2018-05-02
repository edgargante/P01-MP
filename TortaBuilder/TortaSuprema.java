/**
*@author Bautista Cazares David
*@version 1
*/
package TortaBuilder;
import TorteriaDecorator.*;
public class TortaSuprema implements TortaBuilder{

  private Torta t;

  /**Constructor
  */
  public TortaSuprema(){
  }

  /**@see documentacion de la clase TortaBuilder
  */
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

  /**@see documentacion de la clase TortaBuilder
  */
  public Torta getTorta(){
    return t;
  }
}
