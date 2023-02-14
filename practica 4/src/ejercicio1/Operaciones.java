package ejercicio1;

public class Operaciones {
    public static Double[] calcularAreas(Geometria[] formas) {
        if (formas == null) {
            return null;
        }
        Double[] areas = new Double[formas.length];
        for (int i = 0; i < formas.length; i++) {
            areas[i] = formas[i].calcularArea();
        }
        return areas;
    }
}
