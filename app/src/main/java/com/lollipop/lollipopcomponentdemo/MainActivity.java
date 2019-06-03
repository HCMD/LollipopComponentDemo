package com.lollipop.lollipopcomponentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btnList = findViewById(R.id.btn_list);
        View btnDetail = findViewById(R.id.btn_detail);
    }
}
