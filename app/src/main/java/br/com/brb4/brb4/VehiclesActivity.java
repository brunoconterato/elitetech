package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VehiclesActivity extends Activity {

    private final int STAGENUMBER = 4;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles);

        pointBag = PointBag.getInstance();
        car = Car.getInstance();

//        points_text_view_vehicle = (TextView) findViewById(R.id.points_text_view_vehicle);
//        points_text_view_vehicle.setText(Integer.toString(pointBag.getPoints()));
    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//
//        setContentView(R.layout.activity_vehicles);
//
//        points_text_view_vehicle = (TextView) findViewById(R.id.points_text_view_vehicle);
//        points_text_view_vehicle.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void goToRegister(View view) {
//        pointBag.incrementByStage(STAGENUMBER);

//        if(car.isZeroKm())
//            startActivity(new Intent(this, CPFRegisterActivity.class));
//        else
//            startActivity(new Intent(this, RegisterVehicleActivity.class));

        startActivity(new Intent(this, RegisterVehicleActivity.class));
    }
}
