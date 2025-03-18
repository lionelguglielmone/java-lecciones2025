package M1.B_POO_basico;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual de " + titular + ": " + saldo);
    }
}
