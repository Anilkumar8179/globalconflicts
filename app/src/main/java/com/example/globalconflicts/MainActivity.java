package com.example.globalconflicts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView, correctAnswerTextView;
    private RadioGroup answerOptionsGroup;
    private RadioButton optionA, optionB, optionC, optionD;
    private Button submitButton;

    private String correctAnswer = "C. Paris";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionTextView);
        correctAnswerTextView = findViewById(R.id.correctAnswerTextView);
        answerOptionsGroup = findViewById(R.id.answerOptionsGroup);
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);
        submitButton = findViewById(R.id.submitButton);

        questionTextView.setText("What is the capital of France?");

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });
    }

    private void checkAnswer() {
        int selectedId = answerOptionsGroup.getCheckedRadioButtonId();

        if (selectedId == -1) {
            // No option selected
            Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
        } else {
            RadioButton selectedRadioButton = findViewById(selectedId);
            String selectedAnswer = selectedRadioButton.getText().toString();

            if (selectedAnswer.equals(correctAnswer)) {
                // Correct answer
                correctAnswerTextView.setText("Correct! The answer is " + correctAnswer);
            } else {
                // Incorrect answer
                correctAnswerTextView.setText("Incorrect! The correct answer is " + correctAnswer);
            }
        }
    }
}
