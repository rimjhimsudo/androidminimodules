package com.example.listscourse;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class  customAdapter extends AppCompatActivity {
    ArrayList<Teacher> teacherArrayList=Teacher.getTeacher();
    ListView lvcustomteachers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_custom);
        lvcustomteachers=(ListView) findViewById(R.id.lvcustomteachers);
        TeacherAdapter teacherAdapter=new TeacherAdapter();
        lvcustomteachers.setAdapter(teacherAdapter);
        //noow we cant uuse arrayadapter becaue it attaches only 1 textview to 1 vvalue so we need to contrsuct ouur own.

    }

    class TeacherAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return teacherArrayList.size();
        }

        @Override
        //we will change the signature of this function and it is allowed when we ooverride funcions
        //we can channge object to teacher giiven that class B extends A and ex: teacher extends object calss..soo we can chhnge object to teaacher
        public Teacher getItem(int position) {
            return teacherArrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        //it is very important
        //each row of my layout ges creatted
        public View getView(int position, View convertView, ViewGroup parent) {
           //now tocreate view we need view inflater and inflate them with our view.
            View itemView= getLayoutInflater().inflate(R.layout.listitem_teacher,parent,false);

            //now we are not writing findview... directly but itemView.find.. because the tvcourse and tvname doesnt exit in our main layout buut in inflated so
            TextView tvcourse= itemView.findViewById(R.id.tvcourse);
            TextView tvname= itemView.findViewById(R.id.tvname);
            tvcourse.setText(getItem(position).getCourse());
            tvname.setText(getItem(position).getInstructor());

            return itemView;
        }
    }
}
