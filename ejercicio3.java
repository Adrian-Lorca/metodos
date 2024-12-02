import java.util.Scanner;

public class ejercicio3 {
    static void linea(String character, int repeticiones) {
             for(int i = 0; i < repeticiones; i ++) {
                System.out.print(character);
         }   
         System.out.println();
    }
    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);
        System.out.println("Introduce la altura del triangulo: ");
        int altura = triangulo.nextInt();
        for(int i = 1; i <= altura; i++) {
            linea("*", i);
        }
        triangulo.close();
    }
}