package com.example.diu.parentscare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Emergency_Contacts extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency__contacts);

        button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openADDEMERGENCYCONTACT();
            }
        });
    }
    public void openADDEMERGENCYCONTACT()  {
        Intent intent = new Intent(this, ADDEMERGENCYCONTACT.class);
        startActivity(intent);
    }
}
