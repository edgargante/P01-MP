package iterator;
import java.util.Iterator;
import java.util.ArrayList;
public class Mesera{
	ArrayList menus;
	public Mesera(ArrayList menus){
		this.menus=menus;
	}
	public void imprimirMenu(){
		Iterator menuIterator = menus.iterator();
		while(menuIterator.hasNext()){
			Menu menu = (Menu)menuIterator.next();
			menu.imprime();
		}
	}
}
