package com.example.workoutfromhome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Home extends AppCompatActivity implements View.OnClickListener{

    private ImageView img_user;
    private RecyclerView rvWorkout;
    private ArrayList<Workout> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvWorkout = findViewById(R.id.rv_workout);
        rvWorkout.setHasFixedSize(true);

        img_user = findViewById(R.id.iv_img_user);
        img_user.setOnClickListener(this);


        list.addAll(Workoutdata.getlistworkout());
        showRecyclerCardView();
    }


    private void showRecyclerCardView() {
      rvWorkout.setLayoutManager(new LinearLayoutManager(this));
        CardView cardViewHeroAdapter = new CardView(list);
        rvWorkout.setAdapter(cardViewHeroAdapter);
    }

    private void showSelectedHero(Workout wo) {
        Toast.makeText(this, "Kamu memilih " + wo.getJenis(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_img_user:
                Intent gotouser = new Intent(Home.this, UserActivity.class);
                startActivity(gotouser);
                break;
            case R.id.btn_set_tutorial:
                Intent gototutor= new Intent(Home.this, TutorialActivity.class);
                startActivity(gototutor);
                break;
        }
    }
}


