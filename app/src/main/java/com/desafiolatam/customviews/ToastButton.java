package com.desafiolatam.customviews;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by cutiko on 30-11-16.
 */

public class ToastButton extends Button {

    public ToastButton(Context context, String text) {
        super(context);
        setAppearance();
    }

    public ToastButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    private void setAppearance() {
        setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        setTextColor(ContextCompat.getColor(getContext(), android.R.color.white));
        getBackground().setColorFilter(ContextCompat.getColor(getContext(), R.color.colorAccent), PorterDuff.Mode.MULTIPLY);
    }

    public void setName(final String text) {
        setText(text);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
