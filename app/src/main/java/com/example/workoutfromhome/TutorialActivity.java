package com.example.workoutfromhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TutorialActivity extends AppCompatActivity implements View.OnClickListener {

    Button back;
    TextView tutor1;
    TextView tutor2;
    TextView tutor3;
    ImageView img_tutor;
    int val;
    private ArrayList<Tutorial> list = new ArrayList<>();
    private ArrayList<Workout> list2 = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        list.addAll(TutorialData.getlisttutorial());
        list2.addAll(Workoutdata.getlistworkout());
        val = getIntent().getExtras().getInt("Value");
        Tutorial tutor = list.get(val);
        Workout wo = list2.get(val);

        back = findViewById(R.id.btn_back_tutor);
        back.setOnClickListener(this);

        img_tutor = findViewById(R.id.img_tutor_photo);
        tutor1 = findViewById(R.id.data1);
        tutor2 = findViewById(R.id.data2);
        tutor3 = findViewById(R.id.data3);
        //list.addAll(TutorialData.getlisttutorial());
        img_tutor.setImageResource(wo.getFoto());


        tutor1.setText(tutor.getTutor1());
        tutor2.setText(tutor.getTutor2());
        tutor3.setText(tutor.getTutor3());
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back_tutor:
                Intent gotohome = new Intent(TutorialActivity.this, Home.class);
                startActivity(gotohome);
        }
    }
}
