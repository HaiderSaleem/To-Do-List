package com.example.mhaidersaleem.to_dolist;

import android.graphics.Point;
import android.support.constraint.Constraints;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Display display = this.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        LinearLayout lay = findViewById(R.id.main);

        try {

                LinearLayout parent = new LinearLayout(getApplicationContext());
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, height / 5);
                parent.setLayoutParams(params);
                params.topMargin = 5;
                parent.setOrientation(LinearLayout.HORIZONTAL);

                final TextView task = new TextView(getApplicationContext());
                task.setText("abc");
                LinearLayout.LayoutParams pp = new LinearLayout.LayoutParams(width, height / 5);
                pp.topMargin = height / 5;
                task.setLayoutParams(pp);

                parent.addView(task);
                lay.addView(parent);

        }
        catch (Exception ex)
        {
            Log.d("except",ex.getMessage());
        }*/
    }
}
