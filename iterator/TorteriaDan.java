/**
*@author Alvarez de la Rosa Carlos Alexis
*@version 1
*/
package iterator;
import java.util.Iterator;
import java.util.Hashtable;

public class TorteriaDan implements Menu{
	Hashtable menuItems = new Hashtable();

	public TorteriaDan(){
		addItem();
	}
	public void addItem(){
		for(int i=0;i<13;i++){
		Ingrediente menuItem = new Ingrediente(i);
		menuItems.put(menuItem.getNombre(),menuItem);
	}
}
	public Hashtable getItems(){
		return menuItems;
	}

	public Iterator iterator(){
		return menuItems.values().iterator();
	}
	public void imprime(){
		Iterator ite = this.iterator();
		while(ite.hasNext()){
			Ingrediente menu = (Ingrediente)ite.next();
			System.out.println(menu);
		}
	}
}
