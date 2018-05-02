/**
*@author Bautista Cazares David
*@version 1
*/

package SandwicheriaDecorator_Adapter;
public interface Sandwich{

  /**Devuelve el precio total del Sandwich
  *@return double precio del Sandwich
  */
  public double getCost();

  /**Devuelve los ingredientes que contiene el Sandwich
  *@return String ingredientes
  */
  public String getDescription();

  /**Imprime el objeto en forma de los datos que guarda
  *@return String Sandwich
  */
  public String toString();
}
