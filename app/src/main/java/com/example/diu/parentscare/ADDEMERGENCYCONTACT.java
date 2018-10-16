package com.example.diu.parentscare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ADDEMERGENCYCONTACT extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addemergencycontact);

        button = (Button) findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContacts_info();
            }
        });
    }
    public void openContacts_info()  {
        Intent intent = new Intent(this, Contacts_info.class);
        startActivity(intent);
    }
}
