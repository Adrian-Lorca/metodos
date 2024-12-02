public class ejercicio1 {
    public static String convierte_En_Palotes(int numero) {
        String cadena = String.valueOf(numero);
        String resultado = " ";

        for(int i = 0; 0 < cadena.length(); i++) {
            int numerito = cadena.charAt(i) - 0;
            for(int j = 0; 0 < numerito; j++) {
                resultado += "|";
            }
            if(i < cadena.length() - 1) {
                resultado += '-';
            }
        }
    
        return resultado;
    }
    public static void main(String[] args) {
        int numero = 470213;
        String palotes = convierte_En_Palotes(numero);

        System.out.println("El numero " + numero + "ha convertido su valor establecido a: " + palotes); 
    }
}
