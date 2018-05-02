/**
*@author Bautista Cazares David
*@version 1
*/

package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichCarne implements SandwichBuilder{

  private Sandwich sandwich;

  /**Constructor de la clase SandwichCarne
  */
  public SandwichCarne(){
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public void buildSandwich(){
    sandwich = new SSalchicha(new SJamon(
               new SMayonesa(new SQuesoBlanco(new SLechuga(new SJitomate(new SandwichPanBlanco()))))));
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public Sandwich getSandwich(){
    return sandwich;
  }
}
