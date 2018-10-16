package com.example.diu.parentscare;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.diu.parentscare.Database.Info;
import com.example.diu.parentscare.Database.InfoDatabaseSrc;

public class Contacts_info extends AppCompatActivity {
    private Button button;
    private InfoDatabaseSrc src;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_info);
        src = new InfoDatabaseSrc(this);


    }

    public void saveInfo(View view) {
        EditText nameEdit = (EditText) findViewById(R.id.name);
        EditText relationEdit = (EditText) findViewById(R.id.relation);
        EditText mobileEdit = (EditText) findViewById(R.id.mobile);
        EditText emailEdit = (EditText) findViewById(R.id.email);

        String name = nameEdit.getText().toString();
        String relation = relationEdit.getText().toString();
        int mobile = Integer.parseInt(mobileEdit.getText().toString());
        String email = emailEdit.getText().toString();

        Info info = new Info(name, relation, mobile, email);

        boolean status = src.insertInfo(info);
        if (status){
            Toast.makeText( this, "inserted", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "failed to inserted", Toast.LENGTH_LONG).show();
        }
    }
}
