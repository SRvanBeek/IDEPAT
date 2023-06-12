package Week_4.observers;

import Week_4.Observer;
import Week_4.Satellite;

public class NsCompterInLimburg implements Observer {
    private Satellite satellite;

    public NsCompterInLimburg() {
        this.satellite = Satellite.getInstance();
        this.satellite.registerObserver(this);
    }



    @Override
    public void update() {
        System.out.println("URF URF");
    }
}
