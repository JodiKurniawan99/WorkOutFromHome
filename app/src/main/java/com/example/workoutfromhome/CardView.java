package com.example.workoutfromhome;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.workoutfromhome.Workout;

import java.util.ArrayList;

public class CardView extends RecyclerView.Adapter<CardView.CardViewViewHolder> {
    private ArrayList<Workout> listworkout;
    private int x;


    CardView(ArrayList<Workout> list) {
        this.listworkout = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_workout, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {

        Workout hero = listworkout.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hero.getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(hero.getJenis());
        holder.tvDetail.setText(hero.getDetail());

        holder.btntutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), TutorialActivity.class);
                //ini belom kompelx
                i.putExtra("Value", position);
                v.getContext().startActivity(i);

            }
        });




//        holder.btnvideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), "Share " +
//                        listworkout.get(holder.getAdapterPosition()).getJenis(), Toast.LENGTH_SHORT).show();
//            }
//        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listworkout.get(holder.getAdapterPosition()).getJenis(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listworkout.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btntutor; //btnvideo;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_jenis);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btntutor = itemView.findViewById(R.id.btn_set_tutorial);
            //btnvideo = itemView.findViewById(R.id.btn_set_video);
        }
    }
}