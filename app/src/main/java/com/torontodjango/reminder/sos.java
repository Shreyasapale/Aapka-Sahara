package com.torontodjango.reminder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sos extends AppCompatActivity {
    EditText mobileno, message;
    Button sendsms, setPrefffered;


    private TextView textView;
    private EditText editText;
    private Button applyTextButton;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    private String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);



        sendsms = (Button) findViewById(R.id.send_message);
        //Performing action on button click
        sendsms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                text = sharedPreferences.getString(TEXT, "");
                //TODO CAll a person
                final String AAKASHNO = text;
                Intent callIntent = new Intent(Intent.ACTION_CALL);

                callIntent.setData(Uri.parse("tel:" + AAKASHNO));//change the number
                startActivity(callIntent);


            }
        });

        textView = (TextView) findViewById(R.id.textview);
        editText = (EditText) findViewById(R.id.edittext);
        applyTextButton = (Button) findViewById(R.id.apply_text_button);


        applyTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
                saveData();
            }
        });

        loadData();
        updateViews();
    }
    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(TEXT, textView.getText().toString());
        editor.apply();
        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
    }
    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
    }
    public void updateViews() {
        textView.setText(text);

    }
}