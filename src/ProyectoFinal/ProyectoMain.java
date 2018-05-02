import TorteriaDecorator.*;
import SandwicheriaDecorator_Adapter.*;
import iterator.*;
import TortaBuilder.*;
import SandwichBuilder.*;
import java.util.ArrayList;
public class ProyectoMain{

  public static void main(String args[]){
    /////TorteriaDecorator
    Torta torta2 = new TortaIntegral(); {
        torta2 = new Lechuga(torta2);
        torta2 = new Jamon(torta2);
        torta2 = new Jitomate(torta2);
      }

    System.out.println(torta2.getDescripcion() + " $" + torta2.costo());

    ////SandwicheriaDecorator_Adapter
    Sandwich s = new SJamon(new SMayonesa(new SandwichIntegral()));

    System.out.println(s.getCost() + s.getDescription());
    /////Builder
    TortaBuilder t = new TortaMilanesaDeRes();
    TortaChef c = new TortaChef(t);
    c.makeTorta();
    Torta torta = c.getTorta();

    System.out.println(torta);

    /////Builder Sandwich
    SandwichBuilder san = new SandwichEspecial();
    SandwichChef c2 = new SandwichChef(san);
    c2.makeSandwich();
    Sandwich sandwich = c2.getSandwich();
    System.out.println(sandwich.getDescription() + " $" + sandwich.getCost());


    /////Iterator
    System.out.println("\n\n\n\n");
    ArrayList menus = new ArrayList();
		menus.add(new TorteriaDav());
		menus.add(new TorteriaDan());
		menus.add(new TorteriaCal());
		menus.add(new Sandwicheriacha());
		Mesera lupe = new Mesera(menus);
		lupe.imprimirMenu();
  }
}
