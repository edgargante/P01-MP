/**
*@author Alvarez de la Rosa Carlos Alexis
*@version 1
*/
package iterator;
public class Lista {
	Nodo cab, fin;

	/**Constructor de la clase Lista
	*/
	Lista () {
	cab = fin = null;
	}

	/**Agrega un elemento al final de la lista
	*@param Nodo
	*/
	public void agregarFinal (Nodo n) {
	n.sig = null;
	if (cab == null)
	cab = n;
	else {
	n.ant = fin;
	fin.sig = n;
	}
	fin = n;
	}
}
