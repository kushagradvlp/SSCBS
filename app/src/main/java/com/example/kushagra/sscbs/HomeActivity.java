package com.example.kushagra.sscbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onClickAbout(View view)
    {
        Intent intent=new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
    public void onClickStudent(View view)
    {
        Intent intent=new Intent(this,StudentActivity.class);
        startActivity(intent);
    }
    public void onClickPrincipalMessage(View view)
    {
        Intent intent=new Intent(this,PrincipalsMessageActivity.class);
        startActivity(intent);
    }
}
