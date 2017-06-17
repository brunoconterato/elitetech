package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BrandSelectionActivity extends Activity {

    private final int STAGENUMBER = 3;
    private PointBag pointBag;

//    private TextView points_text_view_brand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_selection);

        pointBag = PointBag.getInstance();

//        points_text_view_brand = (TextView) findViewById(R.id.points_text_view_brand);
//        points_text_view_brand.setText(Integer.toString(pointBag.getPoints()));

    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//        setContentView(R.layout.activity_brand_selection);
//
//        points_text_view_brand = (TextView) findViewById(R.id.points_text_view);
//        points_text_view_brand.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void goToChevrolet(View view) {
//        pointBag.incrementByStage(STAGENUMBER);
        startActivity(new Intent(this, VehiclesActivity.class));
    }
}
