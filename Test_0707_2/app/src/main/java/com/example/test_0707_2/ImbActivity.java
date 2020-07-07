package com.example.test_0707_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ImbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        findViewById(R.id.imb_1).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.imb_2).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.imb_3).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.imb_4).setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imb_1:
            case R.id.imb_2:
            case R.id.imb_3:
            case R.id.imb_4:
                Intent intent = new Intent(this, LinearRecyclerViewActivity.class);
                startActivity(intent);
                break;
        }
    }
}
