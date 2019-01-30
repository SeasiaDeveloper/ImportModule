package com.example.kaursarabjot.importmodule;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.altbeacon.adapter.ShowAllBeaconAdapter;
import org.altbeacon.beaconreference.MonitoringActivity;
import org.altbeacon.ui.LoginActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnNextActivity = (Button) findViewById(R.id.btNextActivity);
        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(I);
            }
        });
    }
}
