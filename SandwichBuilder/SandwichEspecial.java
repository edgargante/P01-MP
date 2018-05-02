/**
*@author Bautista Cazares David
*@version 1
*/

package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichEspecial implements SandwichBuilder{

  private Sandwich sandwich;

  /**Constructor de la clase SandwichEspecial
  */
  public SandwichEspecial(){
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public void buildSandwich(){
    sandwich = new SPollo(new SSalchicha(new SJamon(
               new SQuesoBlanco(new SMayonesa(new SJitomate(
               new SLechuga(new SandwichIntegral())))))));
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public Sandwich getSandwich(){
    return sandwich;
  }
}
