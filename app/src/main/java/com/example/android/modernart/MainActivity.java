package com.example.android.modernart;

import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;
//import android.support.v4.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    //private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView i1 = (ImageView) findViewById(R.id.image1);

        float[] src = new float[]{
                1, 0, 0, 0, 0,
                0, 1, 0, 0, 0,
                0, 0, 1, 0, 0,
                0, 0, 0, 1, 0};

        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(src);
        i1.setColorFilter(new ColorMatrixColorFilter(src));


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);

        //Display display = getWindowManager().getDefaultDisplay();

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override

            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {

                ImageView i1 = (ImageView) findViewById(R.id.image1);
                if(progressValue==0)
                    i1.setImageResource(R.drawable.image0);
                else if (progressValue == 1)
                    i1.setImageResource(R.drawable.image16);
                else if (progressValue == 2)
                    i1.setImageResource(R.drawable.image15);
                else if (progressValue == 3)
                    i1.setImageResource(R.drawable.image14);
                else if (progressValue == 4)
                    i1.setImageResource(R.drawable.image13);
                else if (progressValue == 5)
                    i1.setImageResource(R.drawable.image12);
                else if (progressValue == 6)
                    i1.setImageResource(R.drawable.image10);
                else if (progressValue == 7)
                    i1.setImageResource(R.drawable.image9);
                else if (progressValue == 8)
                    i1.setImageResource(R.drawable.image8);
                else if (progressValue == 9)
                    i1.setImageResource(R.drawable.image7);
                else if (progressValue == 10)
                    i1.setImageResource(R.drawable.image6);
                else if (progressValue == 11)
                    i1.setImageResource(R.drawable.image5);
                else if (progressValue == 12)
                    i1.setImageResource(R.drawable.image4);
                else if (progressValue == 13)
                    i1.setImageResource(R.drawable.image3);
                else if (progressValue == 14)
                    i1.setImageResource(R.drawable.image2);
                else if (progressValue == 15)
                    i1.setImageResource(R.drawable.image1);
//                SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
//                seekBar2.setProgress(progressValue);

//                View red_rect1 = findViewById(R.id.first);
//                View red_rect2 = findViewById(R.id.third);
//                View red_rect3 = findViewById(R.id.fifth);
//                View red_rect4 = findViewById(R.id.horizontal_rect1);
//                View red_rect5 = findViewById(R.id.horizontal_rect2);
//
//                View white_rect1 = findViewById(R.id.second);
//                View white_rect2 = findViewById(R.id.fourth);
//
//
//
//                int red_rects_scale = 0xFFFF0000 + (progressValue*(0x00001100));
//                int white_rects_scale = 0xFFFFFFFF - (progressValue*(0x00111111));
//
////                Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
//                if (red_rect1 != null && red_rect2 != null && red_rect3 != null) {
//                    red_rect1.setBackgroundColor(red_rects_scale);
//                    red_rect2.setBackgroundColor(red_rects_scale);
//                    red_rect3.setBackgroundColor(red_rects_scale);
//                    red_rect4.setBackgroundColor(red_rects_scale);
//                    red_rect5.setBackgroundColor(red_rects_scale);
//                }
//
//                if (white_rect1 != null && white_rect2 != null) {
//                    white_rect1.setBackgroundColor(white_rects_scale);
//                    white_rect2.setBackgroundColor(white_rects_scale);
//                }

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
                ImageView i1 = (ImageView) findViewById(R.id.image1);
                if(progressValue==0)
                    i1.setImageResource(R.drawable.image0);
                else if (progressValue == 1)
                    i1.setImageResource(R.drawable.image16);
                else if (progressValue == 2)
                    i1.setImageResource(R.drawable.image15);
                else if (progressValue == 3)
                    i1.setImageResource(R.drawable.image14);
                else if (progressValue == 4)
                    i1.setImageResource(R.drawable.image13);
                else if (progressValue == 5)
                    i1.setImageResource(R.drawable.image12);
                else if (progressValue == 6)
                    i1.setImageResource(R.drawable.image10);
                else if (progressValue == 7)
                    i1.setImageResource(R.drawable.image9);
                else if (progressValue == 8)
                    i1.setImageResource(R.drawable.image8);
                else if (progressValue == 9)
                    i1.setImageResource(R.drawable.image7);
                else if (progressValue == 10)
                    i1.setImageResource(R.drawable.image6);
                else if (progressValue == 11)
                    i1.setImageResource(R.drawable.image5);
                else if (progressValue == 12)
                    i1.setImageResource(R.drawable.image4);
                else if (progressValue == 13)
                    i1.setImageResource(R.drawable.image3);
                else if (progressValue == 14)
                    i1.setImageResource(R.drawable.image2);
                else if (progressValue == 15)
                    i1.setImageResource(R.drawable.image1);



//                float[] src = new float[]{
//                         1, 0, 0, 0, 0,
//                         0, (progressValue+1)/16, 0, 0, 0,
//                         0, 0, 1, 0, 0,
//                         0, 0, 0, 1, 0};

//                ColorMatrix colorMatrix = new ColorMatrix();
//                colorMatrix.set(src);
//                i1.setColorFilter(new ColorMatrixColorFilter(src));
//                i1.setColorFilter(-16977900+progressValue*100, PorterDuff.Mode.MULTIPLY);

//                Matrix matrix = i1.getImageMatrix();
//                matrix.
//                i1.setColorFilter();
//                Toast.makeText(getApplicationContext(),String.valueOf(progressValue),Toast.LENGTH_LONG).show();
                seekBar2.setProgress(progressValue);

//                View red_rect1 = findViewById(R.id.first);
//                View red_rect2 = findViewById(R.id.third);
//                View red_rect3 = findViewById(R.id.fifth);
//                View red_rect4 = findViewById(R.id.horizontal_rect1);
//                View red_rect5 = findViewById(R.id.horizontal_rect2);
//
//                View white_rect1 = findViewById(R.id.second);
//                View white_rect2 = findViewById(R.id.fourth);
//
//
//
//                int red_rects_scale = 0xFFFF0000 + (progressValue*(0x00001100));
//                int white_rects_scale = 0xFFFFFFFF - (progressValue*(0x00111111));
//
////                Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
//                if (red_rect1 != null && red_rect2 != null && red_rect3 != null) {
//                    red_rect1.setBackgroundColor(red_rects_scale);
//                    red_rect2.setBackgroundColor(red_rects_scale);
//                    red_rect3.setBackgroundColor(red_rects_scale);
//                    red_rect4.setBackgroundColor(red_rects_scale);
//                    red_rect5.setBackgroundColor(red_rects_scale);
//                }
//
//                if (white_rect1 != null && white_rect2 != null) {
//                    white_rect1.setBackgroundColor(white_rects_scale);
//                    white_rect2.setBackgroundColor(white_rects_scale);
//                }

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
