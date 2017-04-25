package ru.sberbank.learning.testactivvity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView testView;
    long currentTime;
    private static final String ARG_TIME = "time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testView = (TextView) findViewById(R.id.test);

        if (savedInstanceState == null) {
            currentTime = System.currentTimeMillis();

        } else {
            currentTime = savedInstanceState.getLong(ARG_TIME);
        }
        testView.setText(Long.toString(currentTime));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong(ARG_TIME, currentTime);
    }
}
