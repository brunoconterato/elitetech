package br.com.brb4.brb4;

/**
 * Created by brcon on 17/06/2017.
 */

public class Car {

    private boolean zeroKm;
    private static Car instance;

    private Car(){}

    public static Car getInstance(){
        if (instance == null) {
            synchronized (Car.class) {
                if (instance == null) {
                    instance = new Car();
                }
            }
        }

        return instance;
    }

    public boolean isZeroKm() {
        return zeroKm;
    }

    public void setZeroKm(boolean zeroKm) {
        this.zeroKm = zeroKm;
    }
}
