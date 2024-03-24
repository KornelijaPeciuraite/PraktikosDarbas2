package com.example.praktikosdarbas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText edUserInput;
   TextView tvResults;
   Spinner spSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spSelection = (Spinner) findViewById(R.id.spSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.selection_options,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSelection.setAdapter(adapter);

        this.edUserInput = findViewById(R.id.edUserInput);
        this.tvResults = findViewById(R.id.tvResults);
    }

    public void btnCountClick(View view) {

        String phrase = edUserInput.getText().toString();

        String CharsCount = edUserInput.getText().toString();
        if (TextUtils.isEmpty(CharsCount)) {
            edUserInput.setError("Field cannot be empty");
            this.tvResults.setText("");
            return;
        }

        String selectedOption = this.spSelection.getSelectedItem().toString();
        if(selectedOption.equalsIgnoreCase("Chars")) {
            int charsCount = TextCounter.getCharsCount(phrase);
            this.tvResults.setText(String.valueOf(charsCount));
        }
        else {
            int wordCount = TextCounter.getWordsCount(phrase);
            this.tvResults.setText(String.valueOf(wordCount));

        }
    }
}



