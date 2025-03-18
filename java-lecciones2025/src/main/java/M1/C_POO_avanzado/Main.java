package M1.C_POO_avanzado;

public class Main {
    public static void main(String[] args) {
        /*
        Temas cubiertos:
            ✔ Métodos estáticos
            ✔ Clases internas
            ✔ Sobrecarga de métodos
         */

        Auto auto = new Auto("Toyota");
        auto.acelerar();

        Auto.mostrarMensaje();
    }
}
