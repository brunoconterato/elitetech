package br.com.brb4.brb4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class UserRegisterActivity extends Activity {

    private final int STAGENUMBER = 6;
    private PointBag pointBag;
    private Car car;

//    private TextView points_text_view_user_register;

    EditText name_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        name_et = (EditText) findViewById(R.id.name_et);
        name_et.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                if (event != null&& (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) {
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

                    // NOTE: In the author's example, he uses an identifier
                    // called searchBar. If setting this code on your EditText
                    // then use v.getWindowToken() as a reference to your
                    // EditText is passed into this callback as a TextView

                    View focus = getCurrentFocus();
                    if (focus != null) {
                        InputMethodManager im = (InputMethodManager) getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                        im.hideSoftInputFromWindow(focus.getApplicationWindowToken(), 0);
                    }

                    return true;

                }
                return false;
            }
        });

        pointBag = PointBag.getInstance();

//        points_text_view_user_register = (TextView) findViewById(R.id.points_text_view_user_register);
//        points_text_view_user_register.setText(Integer.toString(pointBag.getPoints()));
    }

//    @Override
//    protected void onResume(){
//        super.onResume();
//
//        points_text_view_user_register.setText(Integer.toString(pointBag.getPoints()));
//    }

    public void goToSellerRegister(View view) {
        startActivity(new Intent(this, SellerActivity.class));
    }
}
