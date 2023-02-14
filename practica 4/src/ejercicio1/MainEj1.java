package ejercicio1;

public class MainEj1 {
    public static void main(String[] args) {
        Geometria c0 = new Cuadrado(5d, "Azul");
        Geometria c1 = new Cuadrado(7,35d, "Verde");
        Geometria cir0 = new Circulo(8.333d, "Azul");
        Geometria cir1 = new Circulo(12.673d, "Rojo");
        Geometria t0 = new Triangulo(8d, 4.5d, "Azul", 4.5d, 3d, 1.5d);
        Geometria t0 = new Triangulo(6d, 7.5d, "Amarillo", 5.5d, 3.2d, 1d);

        Geometria[] formas = {c0, c1, cir0, cir1, t0, t1};
        System.out.println(Arrays.toString(formas));

        System.out.println(Arrays.toString(Operaciones.calcularAreas(formas)));
    }
}
