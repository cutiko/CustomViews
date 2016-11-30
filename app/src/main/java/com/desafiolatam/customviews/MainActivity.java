package com.desafiolatam.customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastButton toastButton = new ToastButton(this, "here");
        toastButton.setName("Its working");

        LinearLayout rootLayout = (LinearLayout) findViewById(R.id.activity_main);

        rootLayout.addView(toastButton);

        Header header = new Header(this);
        header.setHeader("Título", "Subtítulo");

        rootLayout.addView(header);

    }
}
