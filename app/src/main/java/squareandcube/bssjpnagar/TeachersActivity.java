package squareandcube.bssjpnagar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TeachersActivity extends AppCompatActivity {

    LinearLayout tech1,tech2,tech3,tech4,tech5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

        tech1=(LinearLayout)findViewById(R.id.teacher1);
        tech2=(LinearLayout)findViewById(R.id.teacher2);
        tech3=(LinearLayout)findViewById(R.id.teacher3);
        tech4=(LinearLayout)findViewById(R.id.teacher4);
        tech5=(LinearLayout)findViewById(R.id.teacher5);

        tech1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeachersActivity.this,TeacherOneActivity.class);
                startActivity(intent);
            }
        });
        tech2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeachersActivity.this,TeacherTwoActivity.class);
                startActivity(intent);
            }
        });
        tech3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeachersActivity.this,TeacherThreeActivity.class);
                startActivity(intent);
            }
        });
        tech4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeachersActivity.this,TeacherFourActivity.class);
                startActivity(intent);
            }
        });
        tech5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeachersActivity.this,TeacherFiveActivity.class);
                startActivity(intent);
            }
        });
    }
}
