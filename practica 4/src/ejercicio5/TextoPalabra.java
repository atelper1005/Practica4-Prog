package ejercicio5;

public class TextoPalabra {
    public static void main(String[] args) {
        //crear un texto
        String texto = "Esto es un texto de ejemplo para probar el programa, un saludo profe";
        //crear una palabra
        String palabra  = "probar";

        //invocar al método con estos parámetros
        System.out.println("En el texto introducido, la palabra " + "'" + palabra + "'" + " aparece " +
                ocurrenciasPalabraenTexto(texto, palabra) + " veces.");
    }

    public static int ocurrenciasPalabraenTexto(String texto, String palabra){
        int ocurrencias = 0;
        String[] textoSeparado = texto.split(" |,|;");
        for (int i = 0; i < textoSeparado.length; i++) {
            if (textoSeparado[i].equalsIgnoreCase(palabra)){
                ocurrencias++;
            }
        }

        return ocurrencias;
    }
}