package M1.A_fundamentos;

public class ControlDeFlujo {
    public static void ejemplo() {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }
    }
}
