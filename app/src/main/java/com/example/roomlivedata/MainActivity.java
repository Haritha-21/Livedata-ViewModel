package com.example.roomlivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<get> extends AppCompatActivity {

    private TextView tv;
    private Button btn1,btn2;
    //Integer score =0;
    scoreviewmodel scoreviewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
      //  tv.setText(String.valueOf(score));
        scoreviewmodel= new ViewModelProvider(this).get(scoreviewmodel.class);
        scoreviewmodel.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tv.setText(String.valueOf(integer));
            }
        });
      //  tv.setText(String.valueOf(scoreviewmodel.getScore()));

    }

    public void Addscorebtn(View view) {

        addscore();
    }

    private void addscore() {
        scoreviewmodel.addscore();
     //  scoreviewmodel.addscore();
       // tv.setText(String.valueOf(scoreviewmodel.getScore()));
        //score+=1;
       // tv.setText(String.valueOf(score));
    }

    public void resetscorebtn(View view) {
        resetscore();
    }


    private void resetscore() {
        scoreviewmodel.resetscore();
      //  scoreviewmodel.resetscore();
       // tv.setText(String.valueOf(scoreviewmodel.getScore()));
       // score=0;
        // tv.setText(String.valueOf(score));
    }

}