package vodemedia.com.onlineeducation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Yunwen on 5/15/2017.
 */

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        initView();
    }

    private void initView(){
        Button btnStudent = (Button) findViewById(R.id.btn_student);
        Button btnProfessor = (Button) findViewById(R.id.btn_professor);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, LoginActivity.class);
                intent.putExtra("student", "cat");
                SelectActivity.this.startActivity(intent);
            }
        });
        btnProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, LoginActivity.class);
                intent.putExtra("professor","cat" );
                SelectActivity.this.startActivity(intent);
            }
        });

    }
}
