package M1.B_POO_basico;

public class Main {
    public static void main(String[] args) {
        /*
        Temas cubiertos:
            ✔ Clases y objetos
            ✔ Métodos y atributos
            ✔ Constructores
         */
        Persona persona1 = new Persona("Carlos", 30);
        persona1.saludar();

        CuentaBancaria cuenta = new CuentaBancaria("Ana", 500);
        cuenta.depositar(200);
        cuenta.mostrarSaldo();
    }
}
