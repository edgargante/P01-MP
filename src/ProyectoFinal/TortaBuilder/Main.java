package TortaBuilder;
public class Main{

  public static void main(String args[]){

    TortaBuilder t = new TortaMilanesaDeRes();
    TortaChef c = new TortaChef(t);
    c.makeTorta();
    Torta torta = c.getTorta();

    System.out.println(torta);
  }
}
