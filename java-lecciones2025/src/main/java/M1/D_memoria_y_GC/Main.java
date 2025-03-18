package M1.D_memoria_y_GC;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creando objetos...");

        GC obj1 = new GC("Objeto1");
        GC obj2 = new GC("Objeto2");

        System.out.println("Eliminando referencias...");

        obj1 = null;
        obj2 = null;

        // Sugerimos al Garbage Collector que ejecute la recolección de basura
        System.gc();

        System.out.println("Fin del programa.");
    }
}
