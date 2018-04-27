package src.ProyectoFinal;

public class SandwichAdapter implements Adapter{

  private Sanwdich s = new Sandwich();

  public SandwichAdapter(){
  }

  public String getDescripcion(){
    return s.getDescripcion();
  }

  public double costo(){
    return s.getPrecio();
  }

}
