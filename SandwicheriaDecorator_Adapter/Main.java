/**
*@author Bautista Cazares David
*@version 1
*@deprecated movido a ProyectoFinal.java
*/
package SandwicheriaDecorator_Adapter;
public class Main{

  public static void main(String args[]){

    Sandwich s = new PanIntegral(new Mayonesa(new SandwichBase()));

    System.out.println(s.getPrecio() + s.getDescripcion());
  }
}
