package com.wendyjean.quickzone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class List extends AppCompatActivity {


    public Button button13;

    public void init (){
        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent3 = new Intent(List.this,Restaurant.class);
                startActivity(intent3);

            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        init();
    }
}
