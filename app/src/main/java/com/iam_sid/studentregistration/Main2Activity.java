package com.iam_sid.studentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class Main2Activity extends AppCompatActivity {
    String [] sub={"AMP","JAVA","ST","EDP","MANG"};
    String [] name={"WhatsApp","Hike","Instagram","Facebook"};
    int [] img={R.drawable.whatsapp,R.drawable.hike,R.drawable.instagram,R.drawable.facebook};
    Button longPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.list_row,sub);

        ListView listView1=(ListView)findViewById(R.id.listSub);
        listView1.setAdapter(adapter);

        longPress=(Button)findViewById(R.id.buttonLongPress);
        registerForContextMenu(listView1);

        ListView listView2=(ListView)findViewById(R.id.listSocial);
        listView2.setAdapter(new CustomAdap(this,name,img));

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(getApplicationContext(),"You clicked on "+name[position],Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Toast.makeText(getApplicationContext(),"You clicked on "+name[position],Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(getApplicationContext(),"You clicked on "+name[position],Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Toast.makeText(getApplicationContext(),"You clicked on "+name[position],Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0,v.getId(),0,"Upload");
        menu.add(0,v.getId(),1,"Save");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,"Selected Item"+item.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i=getMenuInflater();
        i.inflate(R.menu.menu,menu);
        return true;
    }


}
