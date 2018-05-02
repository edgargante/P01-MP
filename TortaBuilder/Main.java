/**
*@author Bautista Cazares David
*@version 1
*@deprecated movido a ProyectoMain.java
*/
package TortaBuilder;
public class Main{

  public static void main(String args[]){

    TortaBuilder t = new TortaMilanesaDeRes();
    TortaChef c = new TortaChef(t);
    c.makeTorta();
    Torta torta = c.getTorta();

    System.out.println(torta);
  }
}
