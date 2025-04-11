package M1.F_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ----------------- ARRAYLIST -----------------
        // ✔️ Uso: Lista dinámica, acceso rápido por índice.
        // 📌 Contexto: Lista de tareas que pueden cambiar de tamaño.
        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("Estudiar Java");
        tareas.add("Lavar los platos");
        tareas.add("Preparar la cena");
        System.out.println("Tareas (ArrayList): " + tareas);
        System.out.println("Primera tarea: " + tareas.get(0));
        System.out.println();

        // ----------------- LINKEDLIST -----------------
        // ✔️ Uso: Inserciones/eliminaciones frecuentes.
        // 📌 Contexto: Lista de reproducción donde se agregan canciones al inicio y final.
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Smell Like Teen Spirit");
        playlist.addFirst("Soldier Side - Intro");
        playlist.addLast("Piece of Me");
        System.out.println("Playlist (LinkedList): " + playlist);
        System.out.println();

        // ----------------- HASHSET -----------------
        // ✔️ Uso: Conjunto sin duplicados, sin orden.
        // 📌 Contexto: Registro de usuarios únicos en una aplicación.
        HashSet<String> usuarios = new HashSet<>();
        usuarios.add("alice");
        usuarios.add("bob");
        usuarios.add("alice"); // No se repite
        System.out.println("Usuarios únicos (HashSet): " + usuarios);
        System.out.println();

        // ----------------- TREESET -----------------
        // ✔️ Uso: Conjunto ordenado automáticamente.
        // 📌 Contexto: Lista ordenada de ciudades sin duplicados.
        TreeSet<String> ciudades = new TreeSet<>();
        ciudades.add("Buenos Aires");
        ciudades.add("Córdoba");
        ciudades.add("Mendoza");
        ciudades.add("Córdoba"); // No se repite
        System.out.println("Ciudades ordenadas (TreeSet): " + ciudades);
        System.out.println();

        // ----------------- TREEMAP -----------------
        // ✔️ Uso: Diccionario ordenado por clave.
        // 📌 Contexto: Inventario de productos con precios.
        TreeMap<String, Double> productos = new TreeMap<>();
        productos.put("Yerba", 1200.0);
        productos.put("Pan", 600.0);
        productos.put("Leche", 950.0);
        System.out.println("Precios (TreeMap):");
        for (String producto : productos.keySet()) {
            System.out.println("- " + producto + ": $" + productos.get(producto));
        }
        System.out.println();

        // ----------------- QUEUE -----------------
        // ✔️ Uso: Estructura FIFO (First In, First Out).
        // 📌 Contexto: Fila de atención al cliente.
        Queue<String> filaClientes = new LinkedList<>();
        filaClientes.offer("Cliente 1");
        filaClientes.offer("Cliente 2");
        filaClientes.offer("Cliente 3");
        System.out.println("Atendiendo: " + filaClientes.poll()); // Cliente 1
        System.out.println("Siguiente en fila: " + filaClientes.peek()); // Cliente 2
        System.out.println("Fila restante (Queue): " + filaClientes);
        System.out.println();

        // ----------------- STACK -----------------
        // ✔️ Uso: Estructura LIFO (Last In, First Out).
        // 📌 Contexto: Historial de navegación en una app.
        Stack<String> historial = new Stack<>();
        historial.push("Página A");
        historial.push("Página B");
        historial.push("Página C");
        System.out.println("Volver desde: " + historial.pop()); // Página C
        System.out.println("Página actual: " + historial.peek()); // Página B
        System.out.println("Historial (Stack): " + historial);
    }
}