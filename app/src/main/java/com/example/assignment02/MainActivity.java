package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String key = "0034";
    private Button btone;
    private Button bttwo;
    private Button btthree;
    private Button btfour;
    private Button btfive;
    private Button btsix;
    private Button btseven;
    private Button bteight;
    private Button btnine;
    private Button btzero;
    private Button btback;
    private Button btopen;
    private TextView pass;
    int counter = 0;

    @Override

    protected void onStart() {
        super.onStart();
        btzero = findViewById(R.id.bt0);
        btone = findViewById(R.id.bt1);
        bttwo = findViewById(R.id.bt2);
        btthree = findViewById(R.id.bt3);
        btfour = findViewById(R.id.bt4);
        btfive = findViewById(R.id.bt5);
        btsix = findViewById(R.id.bt6);
        btseven = findViewById(R.id.bt7);
        bteight = findViewById(R.id.bt8);
        btnine = findViewById(R.id.bt9);
        btback = findViewById(R.id.btBack);
        btopen = findViewById(R.id.btOp);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        btzero.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "0");
            }
        });
        btone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "1");
            }
        });
        bttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "2");
            }
        });
        btthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "3");
            }
        });
        btfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "4");
            }
        });
        btfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "5");
            }
        });
        btsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "6");
            }
        });
        btseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "7");
            }
        });
        bteight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "8");
            }
        });
        btnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().length()<4)
                    pass.setText(pass.getText().toString() + "9");
            }
        });
        btback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String txtValue = pass.getText().toString();
                if(txtValue.length() > 0)
                {

                    pass.setText(txtValue.substring(0, txtValue.length() - 1));
                }
            }
        });
        btopen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String keyTextValue = pass.getText().toString();
                if(keyTextValue.equals(key))
                {
                    Intent intent = new Intent(MainActivity.this, SafeActivity.class);
                    startActivity(intent);
                }
                else
                {
                    counter++;
                    if(counter>=3)
                    {
                        finish();
                    }
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void setupUIViews(){
        btzero = (Button)findViewById(R.id.bt0);
        btone = (Button)findViewById(R.id.bt1);
        bttwo = (Button)findViewById(R.id.bt2);
        btthree = (Button)findViewById(R.id.bt3);
        btfour = (Button)findViewById(R.id.bt4);
        btfive = (Button)findViewById(R.id.bt5);
        btsix = (Button)findViewById(R.id.bt6);
        btseven = (Button)findViewById(R.id.bt7);
        bteight = (Button)findViewById(R.id.bt8);
        btnine = (Button)findViewById(R.id.bt9);
        btopen = (Button)findViewById(R.id.btOp);
        btback = (Button)findViewById(R.id.btBack);
        pass = (TextView)findViewById(R.id.textview);
    }
}