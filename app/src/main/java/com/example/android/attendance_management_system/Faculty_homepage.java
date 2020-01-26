package com.example.android.attendance_management_system;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Faculty_homepage extends AppCompatActivity implements View.OnClickListener {
    private Button post,view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        post=findViewById(R.id.post_attendance);
        view=findViewById(R.id.view_attendance);

        post.setOnClickListener(this);
        view.setOnClickListener(this);
        setContentView(R.layout.activity_faculty_homepage);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.post_attendance:
                // handle button A click;
                post_att();
                break;
            case R.id.view_attendance:
                // handle button B click;
                view_att();
                break;

        }
    }
    public void post_att(){
        Intent intent=new Intent(this,ViewClass.class);
        startActivity(intent);
    }
    public void view_att(){
        Intent intent=new Intent(this,View_Studentattendance.class);
        startActivity(intent);
    }
}
