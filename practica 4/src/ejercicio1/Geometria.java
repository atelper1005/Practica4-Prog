package ejercicio1;

abstract class Geometria {
    protected double area;
    protected double perimetro;

    protected abstract double calcularArea();

    protected abstract double calcularPerimetro();
}
