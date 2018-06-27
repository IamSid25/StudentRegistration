package com.iam_sid.studentregistration;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

Button btnSignIn,btnCreateNewAcc;
EditText editEmail,editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnSignIn=(Button)findViewById(R.id.bSignIn);
        btnCreateNewAcc=(Button)findViewById(R.id.bCreateNewAcc);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /*int email=editEmail.getText().toString().length();
                int pass=editPassword.getText().toString().length();
                Boolean flag=true;
                if(email<=0)
                {
                    flag=false;
                    editEmail.setError("Please enter valid Email id");
                }
                if(pass<=0)
                {
                    flag=false;
                    editPassword.setError("Please enter correct Password");
                }
               if(flag=true){*/
                    Intent i = new Intent(Main3Activity.this, Main2Activity.class);
                    startActivity(i);
              // }
            }
        });

        btnCreateNewAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,MainActivity.class);
                startActivity(i1);
            }
        });

    }
 
    Boolean isBackPressed=false;
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder1=new AlertDialog.Builder(this);
        builder1.setMessage("Do You Want To Exit");
        builder1.setCancelable(false);

        builder1.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder1.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
    AlertDialog alert11=builder1.create();
    alert11.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i=getMenuInflater();
        i.inflate(R.menu.menu,menu);
        return true;
    }
}
