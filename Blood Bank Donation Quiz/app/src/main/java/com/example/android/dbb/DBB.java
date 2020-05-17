
package com.example.android.dbb;

        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.method.LinkMovementMethod;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.content.Intent;
        import android.graphics.Typeface;
        import android.os.Build;
        import android.support.annotation.RequiresApi;
        import android.support.v4.content.res.ResourcesCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Html;
        import android.util.Log;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;
        import android.widget.Toast;

public class DBB extends AppCompatActivity {
    RadioButton radio1;
    RadioButton radio2;
    RadioButton radio3;
    RadioButton radio11;
    RadioButton radio12;
    RadioButton radio13;
    RadioButton radio21;
    RadioButton radio22;
    RadioButton radio23;
    RadioButton radio24;
    RadioButton radio25;
    RadioButton radio31;
    RadioButton radio32;
    RadioButton radio41;
    RadioButton radio42;
    RadioButton radio51;
    RadioButton radio52;
    EditText name;
    CheckBox radio61;
    CheckBox radio62;
    CheckBox radio63;
    CheckBox radio64;
    EditText radio7;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dbb);
        name = (EditText) findViewById(R.id.Name);
        radio1 = findViewById(R.id.radio_1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio11 = findViewById(R.id.radio11);
        radio12 = findViewById(R.id.radio12);
        radio13 = findViewById(R.id.radio13);
        radio21 = findViewById(R.id.radio21);
        radio22 = findViewById(R.id.radio22);
        radio23 = findViewById(R.id.radio23);
        radio24 = findViewById(R.id.radio24);
        radio25 = findViewById(R.id.radio25);
        radio31 = findViewById(R.id.radio31);
        radio32 = findViewById(R.id.radio32);
        radio41 = findViewById(R.id.radio41);
        radio42 = findViewById(R.id.radio42);
        radio51 = findViewById(R.id.radio51);
        radio52 = findViewById(R.id.radio52);
        radio61 = findViewById(R.id.radio61);
        radio62 = findViewById(R.id.radio62);
        radio63 = findViewById(R.id.radio63);
        radio64 = findViewById(R.id.radio64);
        radio7 = findViewById(R.id.radio7);



    }

    public void submitQuiz(View view) {
        boolean q1radio1 = radio1.isChecked();
        boolean q1radio2 = radio2.isChecked();
        boolean q1radio3 = radio3.isChecked();
        boolean q11radio1 = radio11.isChecked();
        boolean q11radio2 = radio12.isChecked();
        boolean q11radio3 = radio13.isChecked();
        boolean q2radio1 = radio21.isChecked();
        boolean q2radio2 = radio22.isChecked();
        boolean q2radio3 = radio23.isChecked();
        boolean q2radio4 = radio24.isChecked();
        boolean q2radio5 = radio25.isChecked();
        boolean q3radio1 = radio31.isChecked();
        boolean q3radio2 = radio32.isChecked();
        boolean q4radio1 = radio41.isChecked();
        boolean q4radio2 = radio42.isChecked();
        boolean q5radio1 = radio51.isChecked();
        boolean q5radio2 = radio52.isChecked();
        boolean q6radio1 = radio61.isChecked();
        boolean q6radio2 = radio62.isChecked();
        boolean q6radio3 = radio63.isChecked();
        boolean q6radio4 = radio64.isChecked();
        String name2 = name.getText().toString();
        String q7 = radio7.getText().toString();

        int score = calculateScore(q1radio2 , q11radio1 , q11radio3,q2radio1,q2radio2,q2radio3,q2radio4,q2radio5,q3radio2,q4radio2,q5radio2 , q6radio4 ,q6radio1,q6radio2,q6radio3,q7 );
        if(score == 10){
            Toast toast = Toast.makeText(getApplicationContext(), "You can donate now , thanks for your help.", Toast.LENGTH_LONG);
            toast.show();
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Sorry ,you cant donate now , thanks for your help.", Toast.LENGTH_LONG);
            toast.show();
        }
        clearQuizQuestions();
    }


    private void clearQuizQuestions() {
        RadioGroup q1 = (RadioGroup) findViewById(R.id.group1);
        q1.clearCheck();

        RadioGroup q11 = (RadioGroup) findViewById(R.id.group11);
        q11.clearCheck();

        RadioGroup q2 = (RadioGroup) findViewById(R.id.group2);
        q2.clearCheck();

        RadioGroup q3 = (RadioGroup) findViewById(R.id.group3);
        q3.clearCheck();

        RadioGroup q4 = (RadioGroup) findViewById(R.id.group4);
        q4.clearCheck();

        RadioGroup q5 = (RadioGroup) findViewById(R.id.group5);
        q5.clearCheck();
        radio61.setChecked(false);
        radio62.setChecked(false);
        radio63.setChecked(false);
        radio64.setChecked(false);

        name.getText().clear();
        radio7.getText().clear();
    }

    private int calculateScore(boolean q12, boolean q111 ,boolean q113,boolean q21, boolean q22, boolean q23, boolean q24, boolean q25, boolean q32, boolean q42, boolean q52 , boolean q64 ,boolean q61,boolean q62,boolean q63, String q7 ) {
        int score = 0;
        if (q111 || q113 || q21 || q22 || q23 || q24 || q25  ) {
            if (q12 && q32 && q42 && q52 && q64) {
                if(q7.equals("NO"))
                    score=score+10;
                if(q61 || q62 || q63)
                    score=score +0;

            } else {
                score=score +0;
            }
        }
        return score;
    }
}


