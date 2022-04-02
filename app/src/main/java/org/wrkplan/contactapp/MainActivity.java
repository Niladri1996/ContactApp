package org.wrkplan.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ImageView img_search,img_back;
    RelativeLayout rl_editbar,rl_titlebar;
    EditText ed_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeViews();

        img_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl_editbar.setVisibility(View.VISIBLE);
                rl_titlebar.setVisibility(View.GONE);
            }
        });
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl_editbar.setVisibility(View.GONE);
                rl_titlebar.setVisibility(View.VISIBLE);
                ed_search.setText("");
            }
        });
    }

    private void InitializeViews() {
        img_back=findViewById(R.id.img_back);
        img_search=findViewById(R.id.img_search);
        rl_editbar=findViewById(R.id.rl_editbar);
        rl_titlebar=findViewById(R.id.rl_titlebar);
        ed_search=findViewById(R.id.ed_search);
    }
}