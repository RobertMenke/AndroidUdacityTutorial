package com.example.android.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //When your application is compiled the R class is generated. It creates constants that allow you to dynamically identify
        //the various contents of the res folder, including layouts. To learn more, check out the documentation about resources.
        setContentView(R.layout.activity_main);
    }
}
