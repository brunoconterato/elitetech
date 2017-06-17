package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CPFRegisterActivity extends Activity {

    private final int STAGENUMBER = 5;
    private PointBag pointBag;

    private TextView points_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpf_register);

        pointBag = PointBag.getInstance();

        points_text_view = (TextView) findViewById(R.id.points_text_view);
        points_text_view.setText(Integer.toString(pointBag.getPoints()));
    }

    @Override
    protected void onResume(){
        super.onResume();

        points_text_view.setText(Integer.toString(pointBag.getPoints()));
    }

    public void goToBriefActivity(View view) {
        startActivity(new Intent(this, UserRegisterActivity.class));
    }
}
