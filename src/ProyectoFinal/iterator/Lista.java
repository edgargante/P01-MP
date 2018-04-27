public class Lista { 
	Nodo cab, fin; 
	Lista () { 
	cab = fin = null; 
	}  
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
