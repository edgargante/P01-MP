public class Torteria3 implements Observador, MuestraElemento{
    private String objetoVendido;
    private double precioPorSucursal;
    private double ventasTotales;
    private Sujeto torteria;

    public Torteria3(Sujeto torteria) {
        this.torteria = torteria;
        torteria.añadir(this);
    }

    @Override
    public void actualizar(String objetoVendido, double precioPorSucursal, double ventasTotales) {
        this.objetoVendido = objetoVendido;
        this.precioPorSucursal = precioPorSucursal;
        this.ventasTotales = ventasTotales;
        mostrar();
    }


    public void mostrar() {

        System.out.println(
                "Torteria 3: " + "\n" +
                        "Objeto Vendido: " + objetoVendido + "\n" +
                        "Precio por sucursal: " + precioPorSucursal + "\n" +
                        "Ventas Totales: " + ventasTotales +"\n");
    }
}
