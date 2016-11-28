/**
 * Created by aldo on 14/10/16.
 */
public class Compact extends Vehicle {
    protected int Battery;

    public Compact(){
        super();
        Battery = 0; // hybrid
    }

    public Compact(int mod, String man, int cap, int per, int pri, int bat){
        super(mod, man, cap, per, pri);
        Battery = bat;
    }

    public double TotalPerformance (int per, int cap, int bat){
        return per*(cap + bat);
    }

}
