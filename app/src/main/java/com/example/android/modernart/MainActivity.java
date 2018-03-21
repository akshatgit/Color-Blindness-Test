package com.example.android.modernart;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;
//import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    //private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);

        //Display display = getWindowManager().getDefaultDisplay();

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override

            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
//                SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
//                seekBar2.setProgress(progressValue);

                View red_rect1 = findViewById(R.id.first);
                View red_rect2 = findViewById(R.id.third);
                View red_rect3 = findViewById(R.id.fifth);
                View red_rect4 = findViewById(R.id.horizontal_rect1);
                View red_rect5 = findViewById(R.id.horizontal_rect2);

                View white_rect1 = findViewById(R.id.second);
                View white_rect2 = findViewById(R.id.fourth);



                int red_rects_scale = 0xFFFF0000 + (progressValue*(0x00001100));
                int white_rects_scale = 0xFFFFFFFF - (progressValue*(0x00111111));

//                Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
                if (red_rect1 != null && red_rect2 != null && red_rect3 != null) {
                    red_rect1.setBackgroundColor(red_rects_scale);
                    red_rect2.setBackgroundColor(red_rects_scale);
                    red_rect3.setBackgroundColor(red_rects_scale);
                    red_rect4.setBackgroundColor(red_rects_scale);
                    red_rect5.setBackgroundColor(red_rects_scale);
                }

                if (white_rect1 != null && white_rect2 != null) {
                    white_rect1.setBackgroundColor(white_rects_scale);
                    white_rect2.setBackgroundColor(white_rects_scale);
                }

            }

            @Override

            public void onStartTrackingTouch(SeekBar seekBar) {

//                Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();

            }

            @Override

            public void onStopTrackingTouch(SeekBar seekBar) {
                updateRectangles();
//                Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override

            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
                seekBar2.setProgress(progressValue);

                View red_rect1 = findViewById(R.id.first);
                View red_rect2 = findViewById(R.id.third);
                View red_rect3 = findViewById(R.id.fifth);
                View red_rect4 = findViewById(R.id.horizontal_rect1);
                View red_rect5 = findViewById(R.id.horizontal_rect2);

                View white_rect1 = findViewById(R.id.second);
                View white_rect2 = findViewById(R.id.fourth);



                int red_rects_scale = 0xFFFF0000 + (progressValue*(0x00001100));
                int white_rects_scale = 0xFFFFFFFF - (progressValue*(0x00111111));

//                Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
                if (red_rect1 != null && red_rect2 != null && red_rect3 != null) {
                    red_rect1.setBackgroundColor(red_rects_scale);
                    red_rect2.setBackgroundColor(red_rects_scale);
                    red_rect3.setBackgroundColor(red_rects_scale);
                    red_rect4.setBackgroundColor(red_rects_scale);
                    red_rect5.setBackgroundColor(red_rects_scale);
                }

                if (white_rect1 != null && white_rect2 != null) {
                    white_rect1.setBackgroundColor(white_rects_scale);
                    white_rect2.setBackgroundColor(white_rects_scale);
                }

            }

            @Override

            public void onStartTrackingTouch(SeekBar seekBar) {

//                Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();

            }

            @Override

            public void onStopTrackingTouch(SeekBar seekBar) {
                updateRectangles();
//                Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void updateRectangles(){

    }

    // Create Options Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.more_info) {
            DialogFragment newFragment = new MoreInfoDialog();
            newFragment.show(getFragmentManager(), "missiles");
        }
        return true;
    }
}
