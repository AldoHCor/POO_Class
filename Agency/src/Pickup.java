/**
 * Created by aldo on 14/10/16.
 *
 Ancho caja de carga
 Largo caja de carga
 Alto caja de  carga
 Máxima Capcacidad de carga en kg

 */

public class Pickup extends Vehicle {

    protected int BoxWidth;
    protected int BoxLength;
    protected int BoxHeight;
    protected int MaxCap;

    public Pickup(){
        super();
        BoxWidth = 0;
        BoxLength = 0;
        BoxHeight = 0;
        MaxCap = 0;
    }
    public Pickup(int mod, String man, int cap, int per, int pri, int bw, int bl, int bh, int mc){
        super(mod, man, cap, per, pri);
        BoxWidth = bw;
        BoxLength = bl;
        BoxHeight = bh;
        MaxCap = mc;

    }

    /**
     * “Overload” el método rendimientoTotal  en la clase Pickup para que reciba el peso que está cargando como
     * parámetro y  tomando en cuenta que si carga más de su máxima capacidad de carga  el rendimiento
     * se afecta en un 30% menos.
     */

    public double TotalPerformance (int per, int cap, int mc, int weight){
        if (weight > mc){
            return per * cap * 0.7;
        }
        else
            return per*cap;
    }

    public int Volume(int bw, int bl, int bh){
        return bw*bl*bh;
    }

}
