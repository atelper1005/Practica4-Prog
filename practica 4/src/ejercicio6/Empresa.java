package ejercicio6;

import java.util.Arrays;

public class Empresa {
    public static void main(String[] args) {



        Sede sede1 = new Sede("Madrid", "Ventas", "RR.HH.", "Producción");
        Sede sede2 = new Sede("Barcelona", "Ventas", "RR.HH.", "Producción");
        Sede sede3 = new Sede("Valencia", "Ventas", "RR.HH.", "Producción");
        Sede sede4 = new Sede("Oviedo", "Ventas", "RR.HH.", "Producción");

        Empleado empleado1 = new Empleado("ABC123456", "20067600P", "Jorge",
                "Coronil", "Villalba", 1997, false);

        Empleado empleado2 = new Empleado("GHA457894", "19984723A", "Maria",
                "Olmedo", "Vallés", 1981, false);

        Empleado empleado3 = new Empleado("YWX778412", "20012344X", "Manuel",
                "Flores", "Benitez", 1974, true);


        Sede[] sedes = {sede1, sede2, sede3, sede4};
        Empleado[] empleados1 = {empleado1, empleado2, empleado3};


        System.out.println("Sedes: ");
        System.out.println(Arrays.toString(sedes));
        System.out.println("Empleados: ");
        System.out.println(Arrays.toString(empleados1));
    }
}