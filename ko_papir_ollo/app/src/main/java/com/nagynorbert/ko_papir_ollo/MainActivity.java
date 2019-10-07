package com.nagynorbert.ko_papir_ollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        btn_Ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_Human.setImageResource(R.drawable.rock);
                String uzenet = jatekmenet("ollo");

            }

        });
        btn_Papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_Human.setImageResource(R.drawable.paper);
                String uzenet = "jatekmenet";

            }
        });
        btn_Ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_Human.setImageResource(R.drawable.scissors);
                String uzenet = "jatekmenet";
            }
        });




    }

    private String jatekmenet(String ember_valasztasa) {
        String robot_valasztasa;
        Random r=new Random();
        int robot_valasztas_szam=r.nextInt(3)+1;
        switch (robot_valasztas_szam) {
            case 1:
                robot_valasztasa = "ko";
                imageView_Robot.setImageResource(R.drawable.rock);
                break;
            case 2:
                robot_valasztasa = "papir";
                imageView_Robot.setImageResource(R.drawable.paper);
                break;
            case 3:
                robot_valasztasa = "ollo";
                imageView_Robot.setImageResource(R.drawable.scissors);
                break;
        }
        return null;

    }

    private Button btn_Ko,btn_Papir,btn_Ollo;
   //private TextView eredmeny;
    private ImageView imageView_Human,imageView_Robot;
    private int ember_pont,robot_pont;
    private void init(){

        btn_Ko=findViewById(R.id.button_Ko);
        btn_Ollo=findViewById(R.id.button_Ollo);
        btn_Papir=findViewById(R.id.button_papir);

        imageView_Human=findViewById(R.id.imageView_Human);
        imageView_Robot=findViewById(R.id.ImageView_Robot);



    }
}
