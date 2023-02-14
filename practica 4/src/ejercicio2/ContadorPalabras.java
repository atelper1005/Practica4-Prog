package ejercicio2;

import java.util.Objects;

public class ContadorPalabras {

    /*Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto que
     se le pasa por argumento, sin tener en cuenta si están escritas en mayúsculas o minúsculas.*/

    public static void main(String[] args) {
        String texto = "Hola Juanca hola Magdalena";
        System.out.println("La cadena " + "'" + texto + "'" + " tiene " + contadorPalabras(texto) + " palabras");
    }

    public static int contadorPalabras(String texto){
        int contador = 0;
        String [] separador = texto.split(" ");

        for (int i = 0; i < separador.length; i++) {
            contador++;
        }


        //Revisar bucle. No cuenta ninguna palabra repetida en lugar de contarla solo una vez
        for (int i = 0; i < separador.length; i++) {
            for (int j = 0; j < separador.length; j++) {
                if (separador[i].equalsIgnoreCase(separador[j]) && !Objects.equals(separador[i], separador[j]))
                    contador--;
            }
        }


        return contador;
    }
}