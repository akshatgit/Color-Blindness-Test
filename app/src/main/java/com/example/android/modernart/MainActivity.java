package com.example.android.modernart;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;
import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    //private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        //Display display = getWindowManager().getDefaultDisplay();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override

            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {

                progress = progressValue;

                View white_rect = findViewById(R.id.rect_white);
                View red_rect = findViewById(R.id.rect_red);
                View bottom_rect = findViewById(R.id.bottom_rect);

                Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();

                white_rect.setBackgroundColor(16777215 - progressValue*(1 + 16 + 16^2 + 16^3 + 16^4 + 16^5) );
                bottom_rect.setBackgroundColor(16711680 + progressValue*(16^3 + 16^2));
                red_rect.setBackgroundColor(16711680 + progressValue*(16^3 + 16^2));
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
