public class Main {

    public static void main(String[] args) {
        /**
         Crea la clase Main para crear al menos un objeto de cada subclase y añadirlos a la clase Agencia.
         Prueba cada uno de los métodos de la clase Agencia
         */

        Agency a = new Agency();

        Vehicle V1 = new Compact(1,"M1", 150, 1, 100, 1);

        a.addVehicle(V1);

        boolean c = true;
        Vehicle V2 = new FamilyCar(2, "M2", 175, 10, 200, c);

        a.addVehicle(V2);

        Vehicle V3 = new Pickup(3, "M3", 200, 1, 1, 1, 1, 1, 1);

        a.addVehicle(V3);

        System.out.println("Pickup, vehiculo 3 disponible? " + a.available(V3));

        System.out.println(a.toString());

        a.removeVehicle(V3);

        System.out.println("Pickup, vehiculo 3 disponible? " + a.available(V3));

        System.out.println(a.toString());

        System.out.println("\nVehiculos dentro del presupuesto");
        a.acquirableVehicles(100);

        System.out.println("\nMejor desempeño");
        a.bestPerformance();
    }
}
