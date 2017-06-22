package squareandcube.bssjpnagar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout students,teachers,classes,subjects,gallery,extra,about,admission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students=(LinearLayout)findViewById(R.id.dash_students);
        students.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StudentsActivity.class);
                startActivity(intent);
            }
        });

        teachers=(LinearLayout)findViewById(R.id.dashteachers);
        teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TeachersActivity.class);
                startActivity(intent);
            }
        });

        classes=(LinearLayout)findViewById(R.id.dash_class);
        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ClassActivity.class);
                startActivity(intent);
            }
        });

        subjects=(LinearLayout)findViewById(R.id.dash_subject);
        subjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });

        gallery=(LinearLayout)findViewById(R.id.dash_gallery);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GalleryActivity.class);
                startActivity(intent);
            }
        });

        extra=(LinearLayout)findViewById(R.id.dash_extra);
        extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ExtraCurricularActivity.class);
                startActivity(intent);
            }
        });

        about=(LinearLayout)findViewById(R.id.dash_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        admission=(LinearLayout)findViewById(R.id.dash_admission);
        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AdmissionActivity.class);
                startActivity(intent);
            }
        });
    }
}
