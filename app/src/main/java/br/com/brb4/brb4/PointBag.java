package br.com.brb4.brb4;

/**
 * Created by brcon on 17/06/2017.
 */

public class PointBag {

    private int points;
    private static PointBag instance;

    private int lastStage = 1;
    private int indications = 0;

    private PointBag(){};

    public static PointBag getInstance() {
        if (instance == null) {
            synchronized (PointBag.class) {
                if (instance == null) {
                    instance = new PointBag();
                }
            }
        }

        return instance;
    }

    public int getPoints() {
        return points;
    }

    public void incrementByStage(int stagePassed) {
        if(stagePassed > lastStage) {
            switch (stagePassed) {
                case 2:
                    points += PointsForStage.SIMULATION;
                    break;
                case 3:
                    points += PointsForStage.BRAND;
                    break;
                case 4:
                    points += PointsForStage.VEHICLES;
                    break;
                case 5:
                    points += PointsForStage.REGISTER;
                    break;
                case 6:
                    points += PointsForStage.SELLER;
                    break;
                case 7:
                    points += PointsForStage.CONFIRMATION;
                    break;
            }

            incrementLastStage(stagePassed + 1);
        }
    }

    public void incrementByIndications(int indications){

    }

    public class Listener{
        public void onChange() {}
    }

    private void incrementLastStage(int newStage){
        if(newStage > lastStage)
            lastStage++;
    }

    public void incrementIndications(){
        indications++;
    }
}
