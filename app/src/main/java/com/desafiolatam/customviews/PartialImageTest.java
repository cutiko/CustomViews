package com.desafiolatam.customviews;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cutiko on 02-12-16.
 */

public class PartialImageTest {

    private TextView instructionsTv;
    private ImageView imageIv;
    private TextInputLayout placeHolder;
    private EditText answerEt;

    public void create(Context context, ViewGroup root) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.partial_image_test, root, true);
        instructionsTv = (TextView) view.findViewById(R.id.instructionsTv);
        imageIv = (ImageView) view.findViewById(R.id.imageIv);
        placeHolder  = (TextInputLayout) view.findViewById(R.id.instructionPlaceholder);
        answerEt = (EditText) view.findViewById(R.id.answerEt);
    }

    public void setTexts(String instructions, String hint){
        instructionsTv.setText(instructions);
        placeHolder.setHint(hint);
    }

    public void setImage(int resource){
        imageIv.setImageResource(resource);
    }

    public Answer getAnswer() {
        String text = answerEt.getText().toString();
        Answer answer = new Answer(text, text.length());
        return answer;
    }

    public class Answer {
        private String text;
        private int length;

        public Answer(String text, int length) {
            this.text = text;
            this.length = length;
        }

        public String getText() {
            return text;
        }

        public int getLength() {
            return length;
        }
    }


}
