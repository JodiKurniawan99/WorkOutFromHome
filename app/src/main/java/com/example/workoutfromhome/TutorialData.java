package com.example.workoutfromhome;

import java.util.ArrayList;

public class TutorialData {
    private static String[] jenis = {"Latihan otot dada",
            "Latihan otot lengan",
            "Latihan otot Kaki",
            "Latihan otot perut",
            "Latihan otot bahu",
            "Latihan otot punggung",
            "Latihan otot forearms",
            "Latihan otot leher",
            "Latihan otot paha",
            "Latihan otot V-shape"};

    private static String[] data1 = {"1. Pemanasan sebelum latihan dada",
            "1. Pemanasan sebelum latihan lengan",
            "1. Pemanasan sebelum latihan kaki",
            "1. Pemanasan sebelum latihan perut",
            "1. Pemanasan sebelum latihan bahu",
            "1. Pemanasan sebelum latihan punggung",
            "1. Pemanasan sebelum latihan forearms",
            "1. Pemanasan sebelum latihan leher",
            "1. Pemanasan sebelum latihan paha",
            "1. Pemanasan sebelum latihan v-shape"};

    private static String[] data2 = {"2. Lakukan gerakan push up",
            "2. Lakukan gerakan angkat dumbell",
            "2. Lakukan gerakan squat",
            "2. Lakukan gerakan sit up",
            "2. Lakukan gerakan angkat dumbell kebawah",
            "2. Lakukan gerakan angkat dumbell kebelakang",
            "2. Lakukan gerakan angkat dumbell dengan tangan satu",
            "2. Lakukan gerakan atas bawah kepala",
            "2. Lakukan gerakan squat dengan dumbell",
            "2. Lakukan gerakan Pull up"};


    private static String[] data3 = {"3. Lakukan streching dada",
            "3. Lakukan streching lengan",
            "3. Lakukan streching kaki",
            "3. Lakukan streching perut",
            "3. Lakukan streching bahu",
            "3. Lakukan streching punggung",
            "3. Lakukan streching forearms",
            "3. Lakukan streching leher",
            "3. Lakukan streching paha",
            "3. Lakukan streching v-shape"};

    static ArrayList<Tutorial> getlisttutorial() {
        ArrayList<Tutorial> tt = new ArrayList<>();
        for (int i = 0; i < data1.length; i++) {
            Tutorial tutorial = new Tutorial();
            tutorial.setTutor1(data1[i]);
            tutorial.setTutor2(data2[i]);
            tutorial.setTutor3(data3[i]);

            tt.add(tutorial);

        }
        return tt;

    }
}
