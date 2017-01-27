package com.example.android.construct_new_object;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override    // removing this brings us back to the original behaviour
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textobject1 = new TextView(this);  // (activity name which is a context)
        textobject1.setText("wow!");
        textobject1.setTextColor(Color.parseColor("#2750DB"));
        textobject1.setTextSize(50);
        textobject1.setMaxHeight(2); // if the text is longer than 2 lines it gets cut off


        setContentView(textobject1); // normally this is a resource like the xml layout to be more complex

    }

    /* to add the three dots at top right you need the below code and to add
        a menu.xml in a folder called menu in your res (need to make it)

     */

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        // inflate the menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
