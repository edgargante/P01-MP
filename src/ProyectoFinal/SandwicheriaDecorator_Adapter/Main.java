package SandwicheriaDecorator_Adapter;
public class Main{

  public static void main(String args[]){

    Sandwich s = new PanIntegral(new Mayonesa(new SandwichBase()));

    System.out.println(s.getPrecio() + s.getDescripcion());
  }
}
