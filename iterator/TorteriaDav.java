/**
*@author Alvarez de la Rosa Carlos Alexis
*@version 1
*/
package iterator;
import java.util.Iterator;
import java.util.ArrayList;

public class TorteriaDav implements Menu{
	ArrayList items;
	public TorteriaDav(){
		items = new ArrayList();
		for(int i=0;i<13;i++){
			items.add(new Ingrediente(i));
		}
	}
	public Iterator iterator(){
		return items.listIterator();
	}
	public void imprime(){
		Iterator it = items.iterator();
		while(it.hasNext()){
			Ingrediente menu = (Ingrediente)it.next();
			System.out.println(menu);
		}
	}

}
