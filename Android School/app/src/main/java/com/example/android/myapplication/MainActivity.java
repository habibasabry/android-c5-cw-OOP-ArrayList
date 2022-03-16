package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> students = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Student s1 = new Student("يوسف", 14, 12, R.drawable.boy1);
        Student s2 = new Student("سلمان", 13, 10, R.drawable.boy1);
        Student s3 = new Student("ماجد", 15, 11, R.drawable.boy1);

        students.add(s1);
        students.add(s2);
        students.add(s3);



    }
}