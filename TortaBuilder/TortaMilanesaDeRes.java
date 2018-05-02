/**
*@author Bautista Cazares David
*@version 1
*/
package TortaBuilder;
import TorteriaDecorator.*;
public class TortaMilanesaDeRes implements TortaBuilder{

  private Torta t;

  /**Cosntructor
  */
  public TortaMilanesaDeRes(){
  }

  /**@see documentacion de la clase TortaBuilder
  */
  public void buildTorta(){
    this.t = new TortaSimple();{
    this.t = new MilanesaDeRes(t);
    this.t = new QuesoManchego(t);
    this.t = new Mayonesa(t);
    this.t = new Lechuga(t);
    this.t = new Jitomate(t);
  }
  }

  /**@see documentacion de la clase TortaBuilder
  */
  public Torta getTorta(){
    return t;
  }
}
