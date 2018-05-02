/**
*@author Alvarez de la Rosa Carlos Alexis
*@version 1
*/
package iterator;
import java.util.Iterator;
import java.util.ArrayList;
public class Mesera{
	ArrayList menus;

	/**Constructor de la clase Mesera
	*@param ArrayList
	*/
	public Mesera(ArrayList menus){
		this.menus=menus;
	}

	/**imprime los menus
	*/
	public void imprimirMenu(){
		Iterator menuIterator = menus.iterator();
		while(menuIterator.hasNext()){
			Menu menu = (Menu)menuIterator.next();
			menu.imprime();
		}
	}
}
