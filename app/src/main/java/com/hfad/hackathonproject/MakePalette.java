package com.hfad.hackathonproject;

/**
 * Created by sarahzhou on 7/26/16.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;


public class MakePalette extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makepalette);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_american:
                if (checked) {

                } else {

                }
                break;
            case R.id.checkbox_asian:
                if (checked) {

                } else {

                }
                break;
        }
    }

    public void onCheckboxClickedPrice(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.priceone:
                if (checked) {

                } else {

                }
                break;
            case R.id.pricetwo:
                if (checked) {

                } else {

                }
                break;
        }
    }
}