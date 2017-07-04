package com.example.stevenmacdonald.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GetwordActivity extends AppCompatActivity {

    EditText input_text;
    TextView output_view;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getword);


        input_text = (EditText) findViewById(R.id.input_text);
        output_view = (TextView) findViewById(R.id.output_view);
        submitButton = (Button) findViewById(R.id.submit_button);
    }

    public void onSubmitButtonClicked(View button) {
        String sentence = input_text.getText().toString();
        Log.d(getClass().toString(), "onShakeButtonClicked was called");
        Log.d(getClass().toString(), "The sentence was ++++'" + sentence + "'");
        WordCounter user_input = new WordCounter(sentence);
        int count = user_input.wordCount();
        output_view.setText(count);

    }
}
