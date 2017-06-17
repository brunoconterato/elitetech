package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinishedActivity extends Activity {

    private final int STAGENUMBER = 9;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_finished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished);

//        points_text_view_finished = (TextView) findViewById(R.id.points_text_view_finished);
//        points_text_view_finished.setText(Integer.toString(pointBag.getPoints()));
    }

    @Override
    protected void onResume(){
        super.onResume();

//        points_text_view_finished.setText(Integer.toString(pointBag.getPoints()));
    }

    public void goToShareActivity(View view) {
        startActivity(new Intent(this, ShareActivity.class));

    }
}
