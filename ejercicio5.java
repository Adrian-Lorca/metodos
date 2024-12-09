package arrays;
import java.util.Random;

public class ejercicio5 {

    // Función para generar un array de enteros aleatorios
    public static int[] generaArrayInt(int n, int min, int max) {
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    // Función para encontrar el mínimo valor del array
    public static int minimoArrayInt(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    // Función para encontrar el máximo valor del array
    public static int maximoArrayInt(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // Función para calcular la media del array
    public static double mediaArrayInt(int[] array) {
        int suma = 0;
        for (int i : array) {
            suma += i;
        }
        return (double) suma / array.length;
    }

    // Función para verificar si un número está en el array
    public static boolean estaEnArrayInt(int[] array, int numero) {
        for (int i : array) {
            if (i == numero) {
                return true;
            }
        }
        return false;
    }

    // Función para encontrar la posición de un número en el array
    public static int posicionEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1; // Si el número no está en el array
    }

    // Función para voltear el array
    public static int[] volteaArrayInt(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    // Función para rotar el array a la derecha
    public static int[] rotaDerechaArrayInt(int[] array, int n) {
        int[] resultado = new int[array.length];
        n = n % array.length; // Asegurarse de que n no sea mayor que el tamaño del array
        for (int i = 0; i < array.length; i++) {
            resultado[(i + n) % array.length] = array[i];
        }
        return resultado;
    }

    // Función para rotar el array a la izquierda
    public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
        int[] resultado = new int[array.length];
        n = n % array.length; // Asegurarse de que n no sea mayor que el tamaño del array
        for (int i = 0; i < array.length; i++) {
            resultado[(i + array.length - n) % array.length] = array[i];
        }
        return resultado;
    }

    // Función principal para probar las funciones
    public static void main(String[] args) {
        int[] array = generaArrayInt(10, 1, 100);
        System.out.println("Array generado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\nMínimo: " + minimoArrayInt(array));
        System.out.println("Máximo: " + maximoArrayInt(array));
        System.out.println("Media: " + mediaArrayInt(array));
        System.out.println("¿El número 50 está en el array?: " + estaEnArrayInt(array, 50));
        System.out.println("Posición del número 50 en el array: " + posicionEnArray(array, 50));
        System.out.println("Array volteado:");
        for (int i : volteaArrayInt(array)) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray rotado a la derecha 3 posiciones:");
        for (int i : rotaDerechaArrayInt(array, 3)) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray rotado a la izquierda 3 posiciones:");
        for (int i : rotaIzquierdaArrayInt(array, 3)) {
            System.out.print(i + " ");
        }
    }
}
