package com.example.kushagra.sscbs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
    }
    public void onClickBtechCompSc(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbs.du.ac.in/files/courses/btech.pdf"));
        startActivity(intent);
    }
    public void OnClickBbs(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbs.du.ac.in/files/courses/bbssyllabus.pdf"));
        startActivity(intent);
    }
    public void BscCompSc(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbs.du.ac.in/syllabus/B.Sc.(H)-COMPUTER-SCIENCE-SYLLABUS-CBCS(2015-16).pdf"));
        startActivity(intent);
    }
    public void OnClickBfia(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbs.du.ac.in/syllabus/BBA-FIA-SYLLABUS-CBCS(2015-16).pdf"));
        startActivity(intent);
    }
    public void OnClickBms(View view)
    {
        Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sscbs.du.ac.in/syllabus/BMS-SYLLABUS-CBCS(2015-16).pdf"));
        startActivity(intent);
    }
}


