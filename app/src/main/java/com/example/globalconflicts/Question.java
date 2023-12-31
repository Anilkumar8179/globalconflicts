package com.example.globalconflicts;

import java.util.List;

public class Question {

    // Question.java

        private String questionText;
        private List<String> options;
        private String correctAnswer;

        public Question(String questionText, List<String> options, String correctAnswer) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestionText() {
            return questionText;
        }

        public List<String> getOptions() {
            return options;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }


