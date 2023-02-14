package ejercicio1;

public class Triangulo extends Geometria implements Coloreable {
    private Double base;
    private Double altura;
    private final Double[] lados = new Double[3];
    private String color;

    public Triangulo() {};

    public Triangulo(Double base, Double altura, String color, Double a, Double b, Double c) {
        this.base = base;
        this.altura = altura;
        this.color = color;
        this.setLados(a, b, c);
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double[] getLados() {
        return lados;
    }

    public void setLados(Double a, Double b, Double c) {
        lados[0] = a;
        lados[1] = b;
        lados[2] = c;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void colorear(String color) {
    }

    @Override
    public java.lang.String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", lados=" + Arrays.toString(lados) +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected double calcularArea() {
        for (Double lado : getLados()) {
            if (Objects.equals(lado, base)) {
                return ((base * altura)/2)
            }
        }
        return 0;
    }

    @Override
    protected double calcularPerimetro() {
        return (lados[0], lados[1], lados[2]);
    }
}
