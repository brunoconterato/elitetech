package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BriefActivity extends Activity {

    private final int STAGENUMBER = 8;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_brief;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brief);

//        points_text_view_brief = (TextView) findViewById(R.id.points_text_view_brief);
//        points_text_view_brief.setText(Integer.toString(pointBag.getPoints()));
    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//
//        points_text_view_brief.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void goToFinalizedActivity(View view) {
        startActivity(new Intent(this, FinishedActivity.class));
    }
}
