package squareandcube.bssjpnagar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StudentsActivity extends AppCompatActivity {

    TextView stOne,stTwo,stThree,stFour,stFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        stOne=(TextView)findViewById(R.id.arun);
        stTwo=(TextView)findViewById(R.id.student2);
        stThree=(TextView)findViewById(R.id.student3);
        stFour=(TextView)findViewById(R.id.student4);
        stFive=(TextView)findViewById(R.id.student5);

        stOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentsActivity.this,ArunActivity.class);
                startActivity(intent);
            }
        });
        stTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentsActivity.this,StudentTwoActivity.class);
                startActivity(intent);
            }
        });
        stThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentsActivity.this,StudentThreeActivity.class);
                startActivity(intent);
            }
        });
        stFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentsActivity.this,StudentFourActivity.class);
                startActivity(intent);
            }
        });
        stFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StudentsActivity.this,StudentFiveActivity.class);
                startActivity(intent);
            }
        });
    }
}
