package com.wendyjean.quickzone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    public Button button;

    public void init (){
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent2 = new Intent(SearchActivity.this,List.class);
                startActivity(intent2);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);
        init();
    }
}
