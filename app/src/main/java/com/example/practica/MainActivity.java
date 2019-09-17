package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;
    TextView txt1,txt2;
    public static final String DEBUG_TAG = "GesturesActivity";
    int totalpuntos;
    private boolean cancelLongClick = false;

    long tiempoEnMS = 1;
    public static int punto1,puntos2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1=(Button)findViewById(R.id.idbtn1);
        btn2=(Button)findViewById(R.id.idbtn2);
        btn3=(Button)findViewById(R.id.idbtn3);
        btn4=(Button)findViewById(R.id.idbtn4);
        btn5=(Button)findViewById(R.id.idbtn5);

        txt1=(TextView)findViewById(R.id.idtxt1);
        txt2=(TextView)findViewById(R.id.idtxt2);
        btn5.setBackgroundResource(R.drawable.btn2);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                int n1,n2;
                n1= Integer.parseInt(txt1.getText().toString());
                n2=Integer.parseInt(txt2.getText().toString());
                if (n1>n2){
                    Toast.makeText(MainActivity.this, "Equipo 1 es ganador", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Equipo 2 es ganador", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    btn1.setBackgroundResource(R.drawable.btn2);

                    cancelLongClick = false;
                    int p1 =Integer.parseInt(txt1.getText().toString());
                    if (p1==0){
                        Toast.makeText(getBaseContext(), "no ouedes restar", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        p1--;


                        txt1.setText(String.valueOf(p1));
                    }

                }else if(event.getAction() == MotionEvent.ACTION_UP) {

                    btn1.setBackgroundResource(R.drawable.btn1);
                    cancelLongClick = true;
                }

                return true;
            }
        });
        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    btn2.setBackgroundResource(R.drawable.btn2);

                    cancelLongClick = false;
                    int p2=Integer.parseInt(txt1.getText().toString());
                    p2++;
                    txt1.setText(String.valueOf(p2));

                }else if(event.getAction() == MotionEvent.ACTION_UP) {

                    btn2.setBackgroundResource(R.drawable.btn1);
                    cancelLongClick = true;
                }

                return true;

            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    btn3.setBackgroundResource(R.drawable.btn4);

                    cancelLongClick = false;
                    int p3 =Integer.parseInt(txt2.getText().toString());
                    if (p3==0){
                        Toast.makeText(getBaseContext(), "no ouedes restar", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        p3--;

                        txt2.setText(String.valueOf(p3));
                    }

                }else if(event.getAction() == MotionEvent.ACTION_UP) {

                    btn3.setBackgroundResource(R.drawable.btn3);
                    cancelLongClick = true;
                }

                return true;
            }
        });
        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    btn4.setBackgroundResource(R.drawable.btn4);

                    cancelLongClick = false;
                    int p4=Integer.parseInt(txt2.getText().toString());
                    p4++;
                    txt2.setText(String.valueOf(p4));

                }else if(event.getAction() == MotionEvent.ACTION_UP) {

                    btn4.setBackgroundResource(R.drawable.btn3);
                    cancelLongClick = true;
                }

                return true;
            }
        });


    }

    public void onClick(View view) {

        switch (view.getId()){


            case  R.id.idbtn1:


                int p1 =Integer.parseInt(txt1.getText().toString());
                if (p1==0){
                    Toast.makeText(this, "no ouedes restar", Toast.LENGTH_SHORT).show();
                }
                else {
                    p1--;


                    txt1.setText(String.valueOf(p1));
                }

                //     txt1.setText(String.valueOf(punto1));
                //    btn1.setBackground(R.drawable.btn2);
                //    btn1.setBackgroundResource(R.drawable.btn2);

                //   btn1.setBackgroundResource(R.drawable.btn1);
                //   btn2.setBackgroundResource(R.drawable.btn1);

                break;

            case  R.id.idbtn2:

                int p2=Integer.parseInt(txt1.getText().toString());
                p2++;
                txt1.setText(String.valueOf(p2));

           /*     if (btn2.onTouchEvent(t)) {
                    if (btn2.onTouchEvent(t)) {
                        btn2.setBackgroundResource(R.drawable.btn2);
                    }

                    if (btn2.isClickable() == false) {
                        btn2.setBackgroundResource(R.drawable.btn1);
                    }
                }*/
                    punto1++;

                    int  [] colores=new int[100];
                    colores[0]=R.drawable.btn2;
                    colores[1]=R.drawable.btn1;

                    //  if ( punto1%2==0){
                    //       btn2.setBackgroundResource(R.drawable.btn2);
                    //   }

                    //    else {

                    ///      btn2.setBackgroundResource(R.drawable.btn1);
                    // }






                    //    txt1.setText(String.valueOf(punto1));

                    //  btn2.setBackgroundResource(R.drawable.btn2);
                    // btn1.setBackgroundResource(R.drawable.btn1);


                    break;

                    case  R.id.idbtn3:


                        int p3 =Integer.parseInt(txt1.getText().toString());
                        if (p3==0){
                            Toast.makeText(this, "no ouedes restar", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            p3--;

                            txt1.setText(String.valueOf(p3));
                        }



                        break;

                    case  R.id.idbtn4:

                        int p4=Integer.parseInt(txt1.getText().toString());
                        p4++;
                        txt1.setText(String.valueOf(p4));

                        break;
                }
        }
}
