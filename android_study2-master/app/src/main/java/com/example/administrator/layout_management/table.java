package com.example.administrator.layout_management;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class table extends Activity {
    Button backfif;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);

        backfif=(Button)findViewById(R.id.fif_back);
        backfif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(table.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
