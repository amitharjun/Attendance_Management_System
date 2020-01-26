package com.example.android.attendance_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_Login extends AppCompatActivity implements View.OnClickListener {
    public Button admin, faculty, student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__login);

        admin = findViewById(R.id.adminavatar);
        faculty = findViewById(R.id.teacheravatar);
        student = findViewById(R.id.studentavatar);

        admin.setOnClickListener(this);
        faculty.setOnClickListener(this);
        student.setOnClickListener(this);
    }


            @Override
            public void onClick (View v){
                switch (v.getId()) {
                    case R.id.studentavatar:
                        // handle button A click;
                        studentlogin();
                        break;
                    case R.id.teacheravatar:
                        // handle button B click;
                        facultylogin();
                        break;
                    case R.id.adminavatar:
                        adminlogin();
                        break;

                }
            }



    public void studentlogin(){
        Intent intent=new Intent(this,Login_Student.class);
        startActivity(intent);
    }
    public void facultylogin(){
        Intent intent=new Intent(this,Login_Faculty.class);
        startActivity(intent);
    }
    public void adminlogin(){
        Intent intent=new Intent(this,Login_Admin.class);
        startActivity(intent);
    }
}
