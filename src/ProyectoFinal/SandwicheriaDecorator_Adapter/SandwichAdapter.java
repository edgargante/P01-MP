package SandwicheriaDecorator_Adapter;

public class SandwichAdapter extends Torta{

  private Sandwich s = new Sandwich();

  public SandwichAdapter(){
  }

  public String getDescripcion(){
    return s.getDescripcion();
  }

  public double costo(){
    return s.getPrecio();
  }

}
