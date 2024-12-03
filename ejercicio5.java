public class ejercicio5 {
    public static int [] concatena (int a [], int b []) {
        int [] resultado = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++) {
            resultado[i] = a[i];
        }
        for(int i = 0; i < b.length; i++) {
            resultado[a.length + i] = b[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int a [] = {8,9,0};
        int b [] = {1,2,3};
        int concatenar [] = concatena(a,b);
        for(int numero : concatenar) {
            System.out.print(numero + " ");
        }
    }
}
