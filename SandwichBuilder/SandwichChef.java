/**
*@author Bautista Cazares David
*@version 1
*/
package SandwichBuilder;
import SandwicheriaDecorator_Adapter.*;
public class SandwichChef{

  private SandwichBuilder sandwichBuilder;

  /**Constructor de la clase SandwichChef
  *@param SandwichBuilder referencia desde la interfaz a todos los sandwiches predefinidos
  */
  public SandwichChef(SandwichBuilder sb){
    sandwichBuilder = sb;
  }

  /**Devuelve el sandwich que se creo
  *@return Sandwich
  */
  public Sandwich getSandwich(){
    return this.sandwichBuilder.getSandwich();
  }

  /**Utiliza el metodo del sandwich especifico para crear el sandwich
  */
  public void makeSandwich(){
    this.sandwichBuilder.buildSandwich();
  }
}
