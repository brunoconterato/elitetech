package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.ToggleButton;

public class SimulationActivity extends Activity {

    private final int STAGENUMBER = 2;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_simulation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulation);

        Spinner dates = (Spinner)findViewById(R.id.spinner1);
        String[] spinnerItems = new String[22];

        spinnerItems[0] = "Zero km";
        for(int i=1; i<=21; i++){
            int year = 2018 - i;
            spinnerItems[i] = Integer.toString(year);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerItems);
        dates.setAdapter(adapter);

        //Setting RadioGroup Listener
        ((RadioGroup) findViewById(R.id.toggleGroup)).setOnCheckedChangeListener(ToggleListener);

        pointBag = PointBag.getInstance();
        car = Car.getInstance();

//        points_text_view_simulation = (TextView) findViewById(R.id.points_text_view_simulation);
//        points_text_view_simulation.setText(Integer.toString(pointBag.getPoints()));
    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//
//        points_text_view.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void onToggle(View view) {
        ((RadioGroup)view.getParent()).check(view.getId());

        for(int i=0; i<4; i++){
            ((RadioGroup)view.getParent()).getChildAt(i).setBackground(getResources().getDrawable(R.drawable.plots_rounded));
            //TODO: Mudar textos para preto
        }

        view.setBackgroundColor(Color.parseColor("#00ADEF"));
        //TODO: mudar cor do texto para branco
    }

    //RadioGroup Listener
    static final RadioGroup.OnCheckedChangeListener ToggleListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(final RadioGroup radioGroup, final int i) {
            for (int j = 0; j < radioGroup.getChildCount(); j++) {
                final ToggleButton view = (ToggleButton) radioGroup.getChildAt(j);
                view.setChecked(view.getId() == i);
            }
        }
    };

    public void goToBrandSelection(View view) {
        pointBag.incrementByStage(STAGENUMBER);
        startActivity(new Intent(this, BrandSelectionActivity.class));
    }
}
