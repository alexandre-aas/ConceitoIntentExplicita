package com.s.d.a.a.conceitointentexplicita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String qString = extras.getString("qString");

        final TextView textView = findViewById(R.id.textView2);
        textView.setText(qString);
    }

    public void onClick(View view) {
        finish();
    }

    @Override
    public void finish() {
        Intent data = new Intent();

        EditText editText2 = findViewById(R.id.editText2);

        String returnString = editText2.getText().toString();
        data.putExtra("returnData", returnString);

        setResult(RESULT_OK, data);
        super.finish();
    }

}
