package com.desafiolatam.customviews;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

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

        Header xmlHeader = (Header) findViewById(R.id.xmlHeader);
        xmlHeader.setHeader("Título xml", "Subtítulo xml");

        final PartialImageTest partialImageTest = new PartialImageTest();
        partialImageTest.create(this, rootLayout);
        partialImageTest.setTexts("Mire la imagen y responda lo 1ro que se le viene a la mente", "Su respuesta acá");
        partialImageTest.setImage(R.mipmap.ic_launcher);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PartialImageTest.Answer answer = partialImageTest.getAnswer();
                Toast.makeText(MainActivity.this, "Respuesta: " + answer.getText() + " " + answer.getLength(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
