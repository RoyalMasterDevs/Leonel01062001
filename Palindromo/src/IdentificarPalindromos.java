import java.util.Scanner;

public class IdentificarPalindromos {
    public static void main(String[] args) {
        /*
        1. Ingresa una cadena de texto
        2. Formatea el texto (Todoas las letras sean minusculas y eliminar espacios)
        3. Hacer un loop dónde compares el 1-ultimo elemento, el 2-penúltimo, etc.
        4. Si se descubre que dos letras son distintas interrumpir ciclo y decir que no es palindromo, de lo contrario es un palindromo
        */

        Scanner teclado = new Scanner(System.in);
        boolean esPalindromo = true;
        System.out.println("Ingresa una cadana de texto para saber si es un palindromo");
        String palabra = teclado.nextLine();                                        //1. Ingresa una cadena de texto
        palabra = palabra.toLowerCase().replace(" ", "");          //2. Formatea el texto (Todoas las letras sean minusculas y eliminar espacios)
        palabra = palabra.toLowerCase().replace("á", "a");
        palabra = palabra.toLowerCase().replace("é", "e");
        palabra = palabra.toLowerCase().replace("í", "i");
        palabra = palabra.toLowerCase().replace("ó", "o");
        palabra = palabra.toLowerCase().replace("ú", "u");
        for (int i = 0; i < palabra.length()/2 ; i++) {                             //3. Hacer un loop dónde compares el 1-ultimo elemento, el 2-penúltimo, etc.
            if (palabra.charAt(i) != palabra.charAt((palabra.length()-1)-i)){
                esPalindromo = false;                                               //4. Si se descubre que dos letras son distintas interrumpir ciclo y decir que no es palindromo, de lo contrario es un palindromo
                break;
            }
        }
        System.out.println("La palabra: " + palabra + " es una palindromo?..... pues es: " + esPalindromo);
    }
}
