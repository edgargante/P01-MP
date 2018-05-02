public interface Sujeto {
    public void añadir(Observador o);
    public void eliminar(Observador o);
    public void notificar();
}
