package squareandcube.bssjpnagar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubjectsActivity extends AppCompatActivity {

    TextView english,hindi,math,science,social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        english=(TextView)findViewById(R.id.eng);
        hindi=(TextView)findViewById(R.id.hindi);
        math=(TextView)findViewById(R.id.math);
        science=(TextView)findViewById(R.id.science);
        social=(TextView)findViewById(R.id.social);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubjectsActivity.this,EnglishActivity.class);
                startActivity(intent);
            }
        });

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubjectsActivity.this,HindiActivity.class);
                startActivity(intent);
            }
        });
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubjectsActivity.this,MathActivity.class);
                startActivity(intent);
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubjectsActivity.this,ScienceActivity.class);
                startActivity(intent);
            }
        });
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SubjectsActivity.this,SocialScienceActivity.class);
                startActivity(intent);
            }
        });
    }
}
