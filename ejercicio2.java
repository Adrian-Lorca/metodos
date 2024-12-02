public class ejercicio2 {
    public static String convierteEnPalabras(int n) {
        String numeros = String.valueOf(n);
        String[] palabras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String resultado = "";

        for (int i = 0; i < numeros.length(); i++) {
            int digito = numeros.charAt(i) - '0'; 
            resultado += palabras[digito];
            if (i < numeros.length() - 1) {
                resultado += ", ";
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 470213;

        String palabras = convierteEnPalabras(numero);

        System.out.println("El número " + numero + " convertido a palabras es: " + palabras);
    }
}
