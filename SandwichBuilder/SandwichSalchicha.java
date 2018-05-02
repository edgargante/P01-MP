/**
*@author Bautista Cazares David
*@version 1
*/
package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichSalchicha implements SandwichBuilder{

  private Sandwich sandwich;
  /**Cosntructor para la calse SandwichSalchicha
  */
  public SandwichSalchicha(){
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public void buildSandwich(){
    //sandwich = new SJamon(new SMayonesa(new SandwichIntegral()));
    sandwich = new SSalchicha(new SQuesoDePuerco(
               new SQuesoBlanco(new SMayonesa(new SJitomate(new SLechuga(new SandwichPanBlanco()))))));
  }

  /**@see documentacion de la clase SandwichBuilder
  */
  public Sandwich getSandwich(){
    return sandwich;
  }
}
