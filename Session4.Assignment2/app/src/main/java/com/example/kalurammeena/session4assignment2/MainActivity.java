package com.example.kalurammeena.session4assignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ListView listView;
    ListViewAdapter listViewAdapter;

    private final static String name[] = {"Ravi","Ashish","Parul","Kapil","Varun","Faizal","Vaibhav"};

    private final static String number[] = {"9984832142", "9988642474","9986573844","9977999923","9870004103","7988965677","9962158877"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        listViewAdapter = new ListViewAdapter(this, name, number);
        System.out.println("adapter => "+ listViewAdapter.getCount());
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(this,name[position]+"=> "+number[position], Toast.LENGTH_SHORT).show();
    }
}