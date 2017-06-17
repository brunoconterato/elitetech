package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterVehicleActivity extends Activity {

    private final int STAGENUMBER = 5;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_register_vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_vehicle);

        pointBag = PointBag.getInstance();
        car = Car.getInstance();

//        points_text_view_register_vehicle = (TextView) findViewById(R.id.points_text_view_register_vehicle);
//        points_text_view_register_vehicle.setText(Integer.toString(pointBag.getPoints()));
    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//
//        points_text_view_register_vehicle.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void goToUserRegister(View view) {
        startActivity(new Intent(this, CPFRegisterActivity.class));
    }
}
