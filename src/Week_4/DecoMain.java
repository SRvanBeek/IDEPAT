package Week_4;

import Week_4.observers.NsCompterInLimburg;

public class DecoMain {
    public static void main(String[] args) {
        Satellite satellite = Satellite.getInstance();
        NsCompterInLimburg nsCompterInLimburg = new NsCompterInLimburg();

        satellite.notifyObservers();

        for(;;) {
            System.out.println("bruh");
        }
    }
}
