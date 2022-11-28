package com.torontodjango.reminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class feature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);


        RelativeLayout RemindersImg = (RelativeLayout) findViewById(R.id.reminders_icon);
        RemindersImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent remindersIntent = new Intent(feature.this, DashBoardActivity.class);
                startActivity(remindersIntent);
            }
        });

        RelativeLayout ReportsImg = (RelativeLayout)findViewById(R.id.reports_icon);
        ReportsImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reportsIntent = new Intent(feature.this, record.class);
                startActivity(reportsIntent);
            }
        });
        RelativeLayout sosImg = (RelativeLayout)findViewById(R.id.sos_icon);
        sosImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sosIntent = new Intent(feature.this, sos.class);
                startActivity(sosIntent);
            }
        });

        RelativeLayout BlogsImg = (RelativeLayout)findViewById(R.id.blogs_icon);
        BlogsImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogsIntent = new Intent(feature.this, blog.class);
                startActivity(blogsIntent);
            }
        });

    }
}