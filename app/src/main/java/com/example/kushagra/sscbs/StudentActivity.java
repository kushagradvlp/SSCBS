package com.example.kushagra.sscbs;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

    }
    public void onClickCourses(View view)
    {
        Intent intent=new Intent(this,CoursesActivity.class);
        startActivity(intent);
    }
    public void onClickAttendance(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbsweb.co.in/main/login.php"));
        startActivity(intent);
    }
    public void onClickTimeTable(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbsweb.co.in/~sscbsweb/main/timeTable/classTimeTable.php"));
        startActivity(intent);
    }
    public void onClickSocieties(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbs.du.ac.in/index.php/2014-01-16-07-34-49/2014-01-16-07-46-58"));
        startActivity(intent);
    }
}
