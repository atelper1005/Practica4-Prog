package ejercicio1;

public class Circulo extends Geometria implements Coloreable {
    private double radio;
    private String color;

    Circulo() {};

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    protected double calcularArea() {
        return Math.PI*(Math.pow(radio * 2));
    }

    @Override
    protected double calcularPerimetro() {
        return Math.PI*(radio * 2);
    }
}
