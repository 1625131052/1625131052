package com.example.administrator.layout_management;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grid extends Activity{
    Button backsix;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.grid);
        backsix=findViewById(R.id.six_back);
        backsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(grid.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

}
