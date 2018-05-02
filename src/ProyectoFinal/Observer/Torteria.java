import java.util.*;

public class Torteria implements Sujeto {

    private ArrayList observadores;
    private String objetoVendido;
    private double precioPorSucursal;
    private double ventasTotales;

    public Torteria() {
        observadores = new ArrayList();
    }

    public void añadir(Observador o) {
        observadores.add(o);
    }

    public void eliminar(Observador o) {
        int i = observadores.indexOf(o);
        if (i >= 0) {
            observadores.remove(i);
        }
    }

    public void notificar() {
        for (int i = 0; i < observadores.size(); i++) {
            Observador observer = (Observador)observadores.get(i);
            observer.actualizar(objetoVendido, precioPorSucursal, ventasTotales);
        }
    }

    public void informacionCambiada() {
        notificar();
    }

    public void setTorteria(String objetoVendido, double precioPorSucursal, double ventasTotales) {
        this.objetoVendido = objetoVendido;
        this.precioPorSucursal = precioPorSucursal;
        this.ventasTotales = ventasTotales;
        informacionCambiada();
    }
}
