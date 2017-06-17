package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShareActivity extends Activity {

    private final int STAGENUMBER = 10;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

//        points_text_view_share = (TextView) findViewById(R.id.points_text_view_share);
//        points_text_view_share.setText(Integer.toString(pointBag.getPoints()));
    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//
//        points_text_view_share.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void goToMainActivity(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
