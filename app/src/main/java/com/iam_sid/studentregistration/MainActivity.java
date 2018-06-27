package com.iam_sid.studentregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editFN,editLN,editQ,editE;
    Button btnSubmit,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFN=(EditText)findViewById(R.id.etFirstName);
        editLN=(EditText)findViewById(R.id.etLastName);
        editQ=(EditText)findViewById(R.id.etQualification);
        editE=(EditText)findViewById(R.id.etEmailId);
        btnSubmit=(Button)findViewById(R.id.ButtonLogin);
        btnCancel=(Button)findViewById(R.id.ButtonCancel);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i1= getMenuInflater();
        i1.inflate(R.menu.menu,menu);
        return true;
    }
}
