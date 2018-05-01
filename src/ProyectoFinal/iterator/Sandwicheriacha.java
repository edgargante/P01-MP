package iterator;
import java.util.Iterator;

public class Sandwicheriacha implements Menu{
	Lista lis = new Lista();
	public Sandwicheriacha(){
		for(int i=5;i<16;i++){
			lis.agregarFinal(new Nodo(new Ingrediente(i)));
		}
	}
	public Iterator iterator(){
		return new IteradorSandwich(lis);
	}
	public void imprime(){
		Iterator t = this.iterator();
		while(t.hasNext()){
			Ingrediente menu = (Ingrediente)t.next();
			System.out.println(menu);
		}
	}
	private class IteradorSandwich implements Iterator{
		private Lista it;
		private Nodo n;

		public IteradorSandwich(Lista l){
			it=l;
			n=it.cab;
		}

		public Object next(){
			Object temp = n.i;
			n=n.sig;
			return temp;
		}
		public boolean hasNext(){
			return !(n.sig == null);
		}
	}

}
