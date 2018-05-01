package TorteriaDecorator;
public class Main {

    public static void main(String[] args) {
        Torta torta = new TortaSimple(); {
          torta = new Pollo(torta);
        }
        System.out.println(torta.getDescripcion() + " $" + torta.costo());

        Torta torta2 = new TortaIntegral(); {
            torta2 = new Lechuga(torta2);
            torta2 = new Jamon(torta2);
            torta2 = new Jitomate(torta2);

            System.out.println(torta2.getDescripcion() + " $" + torta2.costo());

        }


    }
}
