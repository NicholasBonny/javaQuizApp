package com.example.android.quizapp_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    //widgets
    private TextView mQuestionView;
    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton;
    private Button submitButton;
    private Toolbar toolbar;

    //vars
    private String mAnswers;
    //initialization of  the score
    private int mScore;
    //init of the questions
    private int mQuestionNumber = 0;
    //max number of question
    int maxLength = mQuestionLibrary.mQuestions.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        mQuestionView = (TextView) findViewById(R.id.questions);
        //Toolbar start
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("JAVA QUSTIONS QUIZ APP");
        toolbar.setSubtitle("Multichoice Questions.");

        //ToolBar end
        updateQuestion();
        addListenerOnButton();

    }

    public int addListenerOnButton(){
        mRadioGroup = (RadioGroup) findViewById(R.id.radio_opt);
        submitButton = (Button) findViewById(R.id.submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = mRadioGroup.getCheckedRadioButtonId();
                mRadioButton = (RadioButton) findViewById(selectedId);

                if(mRadioGroup.getCheckedRadioButtonId() == -1){
                    Toast.makeText(Quiz.this, "you must answer atleast one!", Toast.LENGTH_SHORT).show();

                }else if(  mRadioButton.getText() == mAnswers){

                    mScore = mScore + 1;
//                    updateScore(mScore);
                    Toast.makeText(Quiz.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }else {
                    Toast.makeText(Quiz.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        return mScore;
    }


    //update questions
    private void updateQuestion(){
        RadioButton mRadioButton1 = (RadioButton)findViewById(R.id.opt_A);
        RadioButton mRadioButton2 = (RadioButton)findViewById(R.id.opt_B);
        RadioButton mRadioButton3 = (RadioButton)findViewById(R.id.opt_C);

        if(mQuestionNumber < maxLength ){

            mQuestionView.setText(mQuestionLibrary.getQuestions(mQuestionNumber));
            mRadioButton1.setText(mQuestionLibrary.mGetChoice1(mQuestionNumber));
            mRadioButton2.setText(mQuestionLibrary.mGetChoice2(mQuestionNumber));
            mRadioButton3.setText(mQuestionLibrary.mGetChoice3(mQuestionNumber));

            mAnswers = mQuestionLibrary.getmCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }else{


            Intent intent = new Intent(this, Summary.class);
            intent.putExtra("counts", mScore);
            startActivity(intent);
        }
    }
//    //upate score
//    private void updateScore(int point){
//        mScoreView.setText(""+mScore);
//    }
}
