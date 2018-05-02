/**
*@author Bautista Cazares David
*@version 1
*/
package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichPollo implements SandwichBuilder{

  private Sandwich sandwich;

  /**Cosntructor para la clase SandwichPollo
  */
  public SandwichPollo(){
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SPollo(new SMayonesa(new SQuesoBlanco(new SJitomate(new SLechuga(new SandwichPanBlanco())))));
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public Sandwich getSandwich(){
    return sandwich;
  }
}
