/**
*@author Alvarez de la Rosa Carlos Alexis
*@version 1
*/
package iterator;
public class Ingrediente{
	String nombre;
	int cantidad;

	/**imprime la lista de ingredientes y la cantidad restante de ellas
	*@param int ingrediente a mostrar
	*/
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
	  /**Nombre del ingredientes
		*@param String nombre
		*/
		public void setNombre(String n){
			nombre = n;
		}
		/*aumenta la cantidad de ingredientes
		*@param int cantidad
		*/
		public void aumentar(int n){
			cantidad = cantidad + n;
		}
		/**devuelve la cantidad actual de ingredientes
		*@return cantidad
		*/
		public int getCantidad(){
			return cantidad;
		}
		/**devuelve el nombre de un ingrediente
		*@return nombre
		*/
		public String getNombre(){
			return nombre;
		}
		/**imprime el objeto ingredientes
		*@return String
		*/
		public String toString(){
			String me = "Ingrediente: "+nombre+"\n"+"Cantidad: "+cantidad;
			return me;
		}
}
