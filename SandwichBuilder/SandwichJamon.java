/**
*@author Bautista Cazares David
*@version 1
*/
package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichJamon implements SandwichBuilder{

  private Sandwich sandwich;

  /**Cosntructor de la clase SandwichJamon
  */
  public SandwichJamon(){
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SJamon(new SQuesoBlanco(new SQuesoDePuerco(
               new SJitomate(new SJitomate(new SandwichIntegral())))));
  }
  /**@see documentacion de la clase SandwichBuilder
  */
  public Sandwich getSandwich(){
    return sandwich;
  }
}
