public class ejercicio4 {
    static String conviertearray(int [] a) {
        StringBuilder resultado = new StringBuilder();
        for(int numero : a) {
            resultado.append(numero);
        }
        return resultado.toString();
    }
    public static void main(String[] args) {
        int arrayvacio [] = {};
        int arraynumero [] = {8};
        int arraynumeros [] = {6, 2, 5, 0, 1};

        System.out.println("Array vacio: " + conviertearray(arraynumero));
        System.out.println("Arrays con un solo numero: " + conviertearray(arraynumero));
        System.out.println("Array con varios numeros: " + conviertearray(arraynumeros));
    }
}
