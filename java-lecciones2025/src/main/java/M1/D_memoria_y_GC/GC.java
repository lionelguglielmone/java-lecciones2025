package M1.D_memoria_y_GC;

public class GC {
    private String nombre;

    public GC(String nombre) {
        this.nombre = nombre;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("El objeto " + nombre + " ha sido eliminado por el Garbage Collector.");
    }
}
