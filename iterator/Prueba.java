/**
*@author Alvarez de la Rosa Carlos Alexis
*@version 1
*@deprecated movido a ProyectoMain.java
*/
package iterator;
import java.util.ArrayList;

public class Prueba{
	public static void main(String []args){
		ArrayList menus = new ArrayList();
		menus.add(new TorteriaDav());
		menus.add(new TorteriaDan());
		menus.add(new TorteriaCal());
		menus.add(new Sandwicheriacha());
		Mesera lupe = new Mesera(menus);
		lupe.imprimirMenu();
	}
}
