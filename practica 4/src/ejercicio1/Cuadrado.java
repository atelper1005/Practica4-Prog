package ejercicio1;

public class Cuadrado extends Geometria implements Coloreable {
    private Double lado;
    private String color;


    public Cuadrado() {};

    public Cuadrado(Double lado, String color) {
        this.lado = lado;
        this.color = color;
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public String getColor() {
        return color;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    protected double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    protected double calcularPerimetro() {
        return lado * 4;
    }
}
