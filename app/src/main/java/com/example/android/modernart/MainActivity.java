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

        //Display display = getWindowManager().getDefaultDisplay();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override

            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {

                View white_rect = findViewById(R.id.whiteRectangle);
                View red_rect = findViewById(R.id.redRectangle);
                View horizontal_rectangle = findViewById(R.id.horizontal_rect);


                int red_rects_scale = 0xFFFF0000 - (progressValue*(0x00110000));
                int white_rects_scale = 0xFFFFFF00 - (progressValue*(0xFF111100));

                Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
                if (white_rect != null) {
                    white_rect.setBackgroundColor(white_rects_scale);
                }
                if (horizontal_rectangle!= null) {
                    horizontal_rectangle.setBackgroundColor(white_rects_scale);
                }
                if(red_rect!= null){
                    red_rect.setBackgroundColor(white_rects_scale);
                }

            }

            @Override

            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();

            }

            @Override

            public void onStopTrackingTouch(SeekBar seekBar) {
                updateRectangles();
                Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
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
