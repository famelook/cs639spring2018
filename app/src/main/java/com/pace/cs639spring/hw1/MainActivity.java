package com.pace.cs639spring.hw1;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     int animal_click=0;
    ImageView mbird_pic ;
    ImageView mcat_pic ;
    ImageView mdog_pic ;

    View orange_color ;
    View blue_color ;
    View purple_color ;
    View Maroon_color ;
    View green_color;

    TextView mbird_des;
    TextView mcat_des;
    TextView mdog_des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mbird_pic = findViewById(R.id.bird_iv);
        mcat_pic = findViewById(R.id.cat_iv);
        mdog_pic = findViewById(R.id.dog_iv);
        orange_color = findViewById(R.id.orange_color);
        blue_color = findViewById(R.id.blue_color);
        purple_color = findViewById(R.id.purple_color);
        Maroon_color = findViewById(R.id.maroon_color);
        green_color = findViewById(R.id.green_color);

       mbird_pic.setImageResource(R.drawable.bird);
       mcat_pic.setImageResource(R.drawable.cat);
       mdog_pic.setImageResource(R.drawable.dog);

        mbird_des=findViewById(R.id.bird_tv);
        mdog_des = findViewById(R.id.dog_tv);
        mcat_des=findViewById(R.id.cat_tv);

        mbird_pic.setOnClickListener(this);
        mcat_pic.setOnClickListener(this);
        mdog_pic.setOnClickListener(this);
        orange_color.setOnClickListener(this);
        blue_color.setOnClickListener(this);
        purple_color.setOnClickListener(this);
        Maroon_color.setOnClickListener(this);
        green_color.setOnClickListener(this);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View v) {
        paint(v);
    }

    private void paint(View v) {
        if(v instanceof ImageView){
            if (v==mbird_pic) {
                animal_click=1;
                mbird_des.setVisibility(View.VISIBLE);
                mcat_des.setVisibility(View.INVISIBLE);
                mdog_des.setVisibility(View.INVISIBLE);
            }
            if (v==mcat_pic) {
                animal_click=2;
                mcat_des.setVisibility(View.VISIBLE);
                mdog_des.setVisibility(View.INVISIBLE);
                mbird_des.setVisibility(View.INVISIBLE);
            }
            if (v==mdog_pic) {
                animal_click=3;
                mdog_des.setVisibility(View.VISIBLE);
                mcat_des.setVisibility(View.INVISIBLE);
                mbird_des.setVisibility(View.INVISIBLE);
            }
        }
        else {
            if (animal_click==0){
                    Toast.makeText(getApplicationContext(), "Not So fast! Select an animal first! ", Toast.LENGTH_LONG).show();
            }
            else if (v==orange_color) {
                if(animal_click==1)
                {
                    mbird_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.orange), PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==2)
                {
                    mcat_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.orange),PorterDuff.Mode.SRC_IN);

                }
                else if(animal_click==3)
                {
                    mdog_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.orange),PorterDuff.Mode.SRC_IN);

                }
            }
            else if (v==blue_color) {
                if(animal_click==1)
                {
                    mbird_pic.setColorFilter(Color.BLUE,PorterDuff.Mode.SRC_IN);

                }
                else if(animal_click==2)
                {
                    mcat_pic.setColorFilter(Color.BLUE,PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==3)
                {
                    mdog_pic.setColorFilter(Color.BLUE,PorterDuff.Mode.SRC_IN);
                }

            }
            else if (v==purple_color) {
                if(animal_click==1)
                {
                    mbird_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.purple),PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==2)
                {
                    mcat_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.purple),PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==3)
                {
                    mdog_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.purple),PorterDuff.Mode.SRC_IN);
                }
            }
            else if (v==Maroon_color) {
                if(animal_click==1)
                {
                    mbird_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.Maroon),PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==2)
                {
                    mcat_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.Maroon),PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==3)
                {
                    mdog_pic.setColorFilter(mbird_pic.getContext().getResources().getColor(R.color.Maroon),PorterDuff.Mode.SRC_IN);
                }
            }
            else if (v==green_color) {
                if(animal_click==1)
                {
                    mbird_pic.setColorFilter(Color.GREEN,PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==2)
                {
                    mcat_pic.setColorFilter(Color.GREEN,PorterDuff.Mode.SRC_IN);
                }
                else if(animal_click==3)
                {
                    mdog_pic.setColorFilter(Color.GREEN,PorterDuff.Mode.SRC_IN);
                }
            }

        }
    }
}

