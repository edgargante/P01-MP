public class Ingrediente{
	String nombre;
	int cantidad;
	
	public Ingrediente(int n){
		switch(n){
			case 0:  nombre = "bolillo blanco";
			cantidad = 10;
			break;
			case 1:  nombre = "bolillo integral";
			cantidad = 10;
			break;
            case 2:  nombre = "mostaza";
            cantidad = 10;
            break;
            case 3:  nombre = "milanesa de res";
            cantidad = 10;
            break;
            case 4:  nombre = "queso manchego";
            cantidad = 10;
            break;
            case 5:  nombre = "queso de puerco";
            cantidad = 10;
            break;
            case 6:  nombre = "jamon";
            cantidad = 10;
            break;
            case 7:  nombre = "jitomate";
            cantidad = 10;
            break;
            case 8:  nombre = "queso blanco";
            cantidad = 10;
            break;
            case 9:  nombre = "pollo";
            cantidad = 10;
            break;
            case 10: nombre = "lechuga";
            cantidad = 10;
            break;
            case 11: nombre = "mayonesa";
            cantidad = 10;
            break;
            case 12: nombre = "catsup";
            cantidad = 10;
            break;
            case 13: nombre = "pan blanco";
            cantidad = 10;
            break;
            case 14: nombre = "pan integral";
            cantidad = 10;
            break;
            case 15: nombre = "salchicha";
            cantidad = 10;
            break;
		}
	}
		public void setNombre(String n){
			nombre = n;
		}
		public void aumentar(int n){
			cantidad = cantidad + n;
		}
		public int getCantidad(){
			return cantidad;
		}
		public String getNombre(){
			return nombre;
		}
		public String toString(){
			String me = "Ingrediente: "+nombre+"\n"+"Cantidad: "+cantidad;
			return me;
		}
}
