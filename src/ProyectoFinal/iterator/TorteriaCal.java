import java.util.Iterator;

public class TorteriaCal implements Menu{
	private Ingrediente [] items;
	int posicion=0;
	
	public TorteriaCal(){
		items = new Ingrediente [13];
		for(int i=0;i<items.length;i++){
			items[i]=new Ingrediente(i);
		}
	}
	
	public Iterator iterator(){
		return new IteradorTorta(items);
	}
	public void imprime(){
		Iterator t = this.iterator();
		while(t.hasNext()){
			Ingrediente menu = (Ingrediente)t.next();
			System.out.println(menu);
		}
	}
	
	private class IteradorTorta implements Iterator{
		private Ingrediente[] items;
		private int indice;		
		
		public IteradorTorta(Ingrediente []a){
			items = a;
			indice=0;
		}
		
		public Object next(){
			Object temp = items[indice];
			indice += 1;
			return temp;
		}
		public boolean hasNext(){
			return !(indice>=items.length);
		}
	}
}
