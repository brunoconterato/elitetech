package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SellerActivity extends Activity {

    private final int STAGENUMBER = 7;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_seller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);

//        points_text_view_seller = (TextView) findViewById(R.id.points_text_view);
//        points_text_view_seller.setText(Integer.toString(pointBag.getPoints()));
    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//
//        points_text_view_seller.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void goToBriefActivity(View view) {
        startActivity(new Intent(this, BriefActivity.class));
    }
}
