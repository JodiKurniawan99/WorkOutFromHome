package com.example.workoutfromhome;

import java.util.ArrayList;

public class Workoutdata {

    private static String [] jenis ={"Latihan otot dada",
                                     "Latihan otot lengan",
                                     "Latihan otot Kaki",
                                     "Latihan otot perut",
                                     "Latihan otot bahu",
                                     "Latihan otot punggung",
                                     "Latihan otot forearms",
                                     "Latihan otot leher",
                                     "Latihan otot paha",
                                     "Latihan otot V-shape"};

    private static String[] detail ={"Melatih otot dada dengan Push up dan Pull up dengan benar",
                                     "Melatih otot lengan pada bagian tricep dan biceps dengan benar",
                                     "Melatih otot kaki terutama pada bagian betis dengan benar",
                                     "Melatih otot perut dengan benar sehingga mendapatkan perut sixpack",
                                     "Melatih otot bahu yang benar dan mengatasi terjadinya cedera",
                                     "Melatih otot punggung dengan benar agar tidak terjadi cedera pada bagian punggung",
                                     "Melatih otot forearms untuk membentuk otot tangan yang lebih baik",
                                     "Melatih otot leher agar dapat membentuk bagian leher yang baik",
                                     "Melatih otot paha dengan gerakan squad dan cara lainnya agar mendapatkan otot paha yang baik",
                                     "Melatih otot V-shape pada bagian antara bahu dan leher agar mendapatkan bentuk v yang bagus"};


    private static int[] foto={
            R.drawable.ototdada,
            R.drawable.ototlengan,
            R.drawable.ototkaki,
            R.drawable.ototperut,
            R.drawable.ototbahu,
            R.drawable.ototpunggung,
            R.drawable.ototforearm,
            R.drawable.ototleher,
            R.drawable.ototpaha,
            R.drawable.ototvshape
    };

    static ArrayList<Workout> getlistworkout(){
    ArrayList<Workout> wo = new ArrayList<>();
    for (int i = 0; i < jenis.length; i++){
        Workout workout = new Workout();
        workout.setJenis(jenis[i]);
        workout.setDetail(detail[i]);
        workout.setFoto(foto[i]);
        wo.add(workout);

    }
    return wo;
    }



}
