package squareandcube.bssjpnagar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClassActivity extends AppCompatActivity {

    TextView one,two,three,four,five;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        one=(TextView)findViewById(R.id.view_1);
        two=(TextView)findViewById(R.id.view_2);
        three=(TextView)findViewById(R.id.view_3);
        four=(TextView)findViewById(R.id.view_4);
        five=(TextView)findViewById(R.id.view_5);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });
    }
}
