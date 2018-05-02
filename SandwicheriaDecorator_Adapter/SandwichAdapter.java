/**
*@author Bautista Cazares David
*@version 1
*/
package SandwicheriaDecorator_Adapter;
import TorteriaDecorator.*;
public class SandwichAdapter extends Torta{

  private Sandwich s;

  /**Cosntructor de la clase SandwichAdapter
  *@param Sandwich a adaptar
  */
  public SandwichAdapter(Sandwich s){
    this.s = s;
  }

  /**@see documentacion clase SandwichAdapter
  */
  public String getDescripcion(){
    return s.getDescription();
  }

  /**@see documentacion clase SandwichAdapter
  */
  public double costo(){
    return s.getCost();
  }

}
