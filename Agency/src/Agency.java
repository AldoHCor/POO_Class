/**
 * Created by aldo on 14/10/16.

 *Crea una clase Agencia que tiene una colección de vehículos  para vender.
 *Usa los iterators para trabajar con la colección.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Agency {
    protected int Col = 4;

    ArrayList<Vehicle> agency = new ArrayList<>(Col);

    public Agency() {
        ListIterator <Vehicle> itrAgency = agency.listIterator();
        int i = 0;
        while (itrAgency.hasNext()) {
            Vehicle auxV = new Vehicle();
            agency.add(i, auxV);
            i++;
        }

        /**
        for (int i = 0; i < Col; i++) {
            Vehicle auxV = new Vehicle();
            agency.add(i, auxV);
        }
         */
    }

    public void addVehicle(Vehicle v) {
        agency.add(v);
    }

    public void removeVehicle(Vehicle v){
        agency.remove(v);
    }

    public boolean available(Vehicle v) {
        return agency.contains(v);
    }

    public void acquirableVehicles(int budget) {

        ListIterator <Vehicle> itrAgency = agency.listIterator();

        while(itrAgency.hasNext()){
            Vehicle auxV = itrAgency.next();
            int auxPrice = auxV.getPrice();
            if (auxPrice <= budget) {
                System.out.println(auxV.toString());
            }
        }
    }

    public void bestPerformance () {

        ListIterator <Vehicle> itrAgency = agency.listIterator();
        int aux = 0;
        Vehicle auxV1 = new Vehicle();

        while(itrAgency.hasNext()){
            Vehicle auxV = itrAgency.next();

            if (auxV.getPerformance() > aux){
                aux = auxV.getPerformance();
                auxV1 = auxV;
            }
        }
        System.out.println(auxV1.toString());
    }

    public String toString (){
        ListIterator <Vehicle> itrAgency = agency.listIterator();
        String aux = "";

        while (itrAgency.hasNext()) {

            Vehicle auxV = itrAgency.next();

            aux = aux + "\n\n" + auxV.toString();
        }

        return aux;
    }



    /**
 La clase Agencia tiene los siguientes métodos:

 agregarCarro (de cualquier tipo)
 borraCarro (de cualquier tipo)
 existencia: debe regresar verdadero si el vehículo que quieres está disponible
 carrosAdquiribles: Proporciona una lista de autos que puedes adquirir con tu presupuesto.
 mejorRendimiento: Proporciona los datos del  vehículo que tienen el mayor rendimiento
 toString: lista todos los vehículos con que se cuenta
 muestraPickups: Lista todas las Pickups y el volume de su caja de carga.

 */
}
