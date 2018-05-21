package com.example.android.quizapp_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private Quiz mQuiz = new Quiz();

    //Widgets
    private TextView summaryTextView;
    private TextView summaryTextView1;
    private TextView summaryTextView2;
    private TextView summaryTextView3;
    private TextView summaryTextView4;
    private TextView summaryTextView5;
    private TextView summaryTextView6;
    private TextView summaryTextView7;
    private TextView summaryTextView8;
    private TextView summaryTextView9;
    private Button exitButton;
    private Toolbar toolbar;
    private TextView mScoreView;

    //vars
    int summaryMax = mQuestionLibrary.mCorrectAnswers.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        summaryTextView = (TextView)findViewById(R.id.summary);
        summaryTextView1 = (TextView)findViewById(R.id.summary1);
        summaryTextView2 = (TextView)findViewById(R.id.summary2);
        summaryTextView3 = (TextView)findViewById(R.id.summary3);
        summaryTextView4 = (TextView)findViewById(R.id.summary4);
        summaryTextView5 = (TextView)findViewById(R.id.summary5);
        summaryTextView6 = (TextView)findViewById(R.id.summary6);
        summaryTextView7 = (TextView)findViewById(R.id.summary7);
        summaryTextView8 = (TextView)findViewById(R.id.summary8);
        summaryTextView9 = (TextView)findViewById(R.id.summary9);
        mScoreView = (TextView) findViewById(R.id.score);

        toolbar = (Toolbar) findViewById(R.id.toolBar);

        exitButton =(Button)findViewById(R.id.quitApp);
        //Toolbar start
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SOLUTIONS");
        //ToolBar end
        updateScore();
        displaySummary();

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }

    public void displaySummary(){
        int summaryCount = 0;

        summaryTextView.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView1.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView2.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView3.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView4.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView5.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView6.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView7.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView8.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));
        summaryTextView9.setText(mQuestionLibrary.getmCorrectAnswer(summaryCount++));

    }

    private void updateScore(){
      mScoreView.setText(""+getIntent().getExtras().getInt("counts"));
  }
}
