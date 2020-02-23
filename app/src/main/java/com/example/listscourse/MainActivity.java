package com.example.listscourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] names=new String[]{"vipin","rimjhim","rishabh","tanya","shiristy","riya","vipin","rimjhim","rishabh","tanya","shiristy","riya","vipin","rimjhim","rishabh","tanya","shiristy","riya"};
    ListView lvnames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvnames=findViewById(R.id.lvnames);
        //adapter to attach data with view
        ArrayAdapter<String> arrayadap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1);
        //first is context and second is we have to attach layout for every single item so we use simple_list_item1 layout.
        //when i use android.R that means i am using from insie android layout. and u can control+click on it to seethat layput and item1 is third parameter is used becaue that is the id.

       // lvnames.setOnItemClickListener();
    }
}
