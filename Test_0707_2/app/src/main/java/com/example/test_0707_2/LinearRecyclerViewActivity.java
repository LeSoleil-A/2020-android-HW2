package com.example.test_0707_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class LinearRecyclerViewActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView recyclerView;
    private LinearAdapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);
        initialize();
    }

    private void initialize() {
        findViewById(R.id.imb_1).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.imb_2).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.imb_3).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.imb_4).setOnClickListener((View.OnClickListener) this);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter = new LinearAdapter(Table.getData());
        recyclerView.setAdapter(myAdapter);

        Toast.makeText(LinearRecyclerViewActivity.this, "There are "
                + ((ViewGroup)LinearRecyclerViewActivity.this.getWindow().getDecorView()).getChildCount() + " views", Toast.LENGTH_SHORT).show();

        LinearRowActivity itemDecoration = new LinearRowActivity(Color.BLUE);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        //recyclerView_grid.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LinearRecycler", "RecyclerViewActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LinearRecycler", "RecyclerViewActivity onResume");
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imb_1:
            case R.id.imb_2:
            case R.id.imb_3:
            case R.id.imb_4:
                Intent intent = new Intent(this, MessageActivity.class);
                startActivity(intent);
                break;
        }
    }
}
