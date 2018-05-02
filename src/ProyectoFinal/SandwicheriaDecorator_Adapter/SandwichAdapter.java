package SandwicheriaDecorator_Adapter;
import TorteriaDecorator.*;
public class SandwichAdapter extends Torta{

  private Sandwich s;

  public SandwichAdapter(Sandwich s){
    this.s = s;
  }

  public String getDescripcion(){
    return s.getDescription();
  }

  public double costo(){
    return s.getCost();
  }

}
