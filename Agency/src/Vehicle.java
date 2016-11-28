/**
 * Created by aldo on 14/10/16.

 Modelo
 Fabricante
 Capacidad (tamaño del tanque de combustible)
 Rendimiento (km/lt) o kwh/100 km
 Precio

 Metodos
 RendimientoTotal: Calcula cuántos kilómetros puedes recorrer con tanque lleno  o con
 la capacidad total de kwh de la bateria(o capacidad total de energía)

 */
public class Vehicle {

    protected int Model;
    protected String Manufacturer;
    protected int Capacity; // tank lt
    protected int Performance; // (km/lt) o kwh/100 km
    protected int Price;

    public Vehicle (){

        Model = 0;
        Manufacturer = "";
        Capacity = 0;
        Performance = 0;
        Price = 0;
    }

    public Vehicle (int mod, String man, int cap, int per, int pri){

        Model = mod;
        Manufacturer = man;
        Capacity = cap;
        Performance = per;
        Price = pri;
    }
    //Model, int
    public void setModel(int mod){
        Model = mod;
    }
    public int getModel(){
        return Model;
    }
    // String,  Manufacturer
    public void setManufacturer(int man){
        Model = man;
    }
    public String getManufacturer(){
        return Manufacturer;
    }

    // int Capacity
    public void setCapacity(int cap){
        Capacity = cap;
    }
    public int getCapacity(){
        return Capacity;
    }

    // int Performance
    public void setPerformance(int per){
        Performance = per;
    }
    public int getPerformance(){
        return Performance;
    }

    // int Price;
    public void setPrice(int pri){
        Price = pri;
    }
    public int getPrice(){
        return Price;
    }

/**
 * Metodos
 RendimientoTotal: Calcula cuántos kilómetros puedes recorrer con tanque lleno  o con
 la capacidad total de kwh de la bateria(o capacidad total de energía)
 */


    public double TotalPerformance (int per, int cap){
        return per*cap;
    }
    public String toString () {
        return "Model: " + Model + "\nManufacturer: " + Manufacturer + "\nCapacity: " + Capacity
                + "\nPerformance: " + Performance + "\nPrice: " + Price;
    }
}
/**
 * protected int Model;
 protected String Manufacturer;
 protected int Capacity; // tank lt
 protected int Performance; // (km/lt) o kwh/100 km
 protected int Price;

 */
