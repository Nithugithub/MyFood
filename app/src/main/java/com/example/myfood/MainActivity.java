package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    int [] pic={R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8};
    String[] foodNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       foodNames = getResources().getStringArray(R.array.food);
        gridView=(GridView)findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this,foodNames,pic);
        gridView.setAdapter(adapter);


    }
}