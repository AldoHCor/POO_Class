/**
 * Created by aldo on 14/10/16.
 */
public class FamilyCar extends Vehicle {
    protected boolean DVD;

    public FamilyCar() {
        super();
        DVD = false;
    }

    public FamilyCar(int mod, String man, int cap, int per, int pri, boolean dvd) {
        super(mod, man, cap, per, pri);
        DVD = dvd;
    }
}
