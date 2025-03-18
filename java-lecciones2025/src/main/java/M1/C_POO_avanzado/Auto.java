package M1.C_POO_avanzado;

public class Auto {
    private String marca;
    private int velocidad;

    public Auto(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " aceleró a " + velocidad + " km/h");
    }

    public static void mostrarMensaje() {
        System.out.println("Todos los autos pueden acelerar.");
    }
}
