package com.example.v1_s24_mad_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    TextView tvResult;
    EditText etName, etSemester;
    Button btnCancel, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String sem = etSemester.getText().toString();
                if(name.isEmpty() || sem.isEmpty())
                {
                    /*if(name.isEmpty())
                    {
                        etName.setError("Name is empty");
                    }
                    if(sem.isEmpty())
                    {
                        etSemester.setError("Give Semester");
                    }*/

                    Toast.makeText(Second.this, getString(R.string.something_is_missing), Toast.LENGTH_LONG).show();

                }
                else {
                    int semester = Integer.parseInt(sem);
                    String result = getString(R.string.result_name)
                            +name+getString(R.string.sem)+semester;
                    tvResult.setText(result);
                }
            }
        });

    }

    private void init()
    {
        tvResult = findViewById(R.id.tvResult);
        etName = findViewById(R.id.etName);
        etSemester = findViewById(R.id.etSemester);
        btnCancel = findViewById(R.id.btnCancel);
        btnSubmit = findViewById(R.id.btnSubmit);
    }


}