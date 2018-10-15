package com.example.mrinalmriyo.listviewdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView=(ListView)findViewById(R.id.listView);

        final ArrayList<String> myFriends=new ArrayList<String>();
        myFriends.add("Priti");
        myFriends.add("Irfan");
        myFriends.add("Pushkar");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,myFriends);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

              
               Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
               intent.putExtra("name",myFriends.get(position));
               startActivity(intent);



            }
        });

    }
}
