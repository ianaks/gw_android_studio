package com.gw_android.guesswhat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_layout();
    }

    private void init_layout(){
        final Context context = this.getApplicationContext();
        ImageView buttonRecords = (ImageView)findViewById(R.id.button_records);
        buttonRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RecordsActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
