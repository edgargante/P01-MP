import TorteriaDecorator.*;
import SandwicheriaDecorator_Adapter.*;
import iterator.*;
import java.util.ArrayList;
public class ProyectoMain{

  public static void main(String args[]){

    Torta torta2 = new TortaIntegral(); {
        torta2 = new Lechuga(torta2);
        torta2 = new Jamon(torta2);
        torta2 = new Jitomate(torta2);
      }

    System.out.println(torta2.getDescripcion() + " $" + torta2.costo());

    Sandwich s = new PanIntegral(new SMayonesa(new SandwichBase()));

    System.out.println(s.getCost() + s.getDescription());


    ArrayList menus = new ArrayList();
		menus.add(new TorteriaDav());
		menus.add(new TorteriaDan());
		menus.add(new TorteriaCal());
		menus.add(new Sandwicheriacha());
		Mesera lupe = new Mesera(menus);
		lupe.imprimirMenu();
  }
}
