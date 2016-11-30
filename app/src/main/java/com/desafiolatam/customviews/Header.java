package com.desafiolatam.customviews;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by cutiko on 30-11-16.
 */

public class Header extends LinearLayout {

    private TextView title, subtitle;

    public Header(Context context) {
        super(context);

        initViews(context);
    }

    private void initViews(Context context) {
        title = new TextView(context);
        subtitle = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        setLayoutParams(layoutParams);
        setOrientation(VERTICAL);
        title.setLayoutParams(layoutParams);
        subtitle.setLayoutParams(layoutParams);
        title.setGravity(Gravity.LEFT);
        subtitle.setGravity(Gravity.CENTER);
        int padding = getResources().getDimensionPixelOffset(R.dimen.activity_vertical_margin);
        title.setPadding(padding, padding, padding, padding);
        subtitle.setPadding(padding, 0, padding, padding);
        title.setTextSize(getResources().getDimensionPixelOffset(R.dimen.header_title_text_size));
        subtitle.setTextColor(ContextCompat.getColor(context, android.R.color.darker_gray));
        addView(title);
        addView(subtitle);
    }

    public void setHeader(String title, String subtitle) {
        this.title.setText(title);
        this.subtitle.setText(subtitle);
    }


}
