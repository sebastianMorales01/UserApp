package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    String name,phone,email,picture;

    private TextView item_name,item_phone,item_email;
    private CircleImageView item_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = getIntent().getStringExtra("NAME");
        phone = getIntent().getStringExtra("PHONE");
        email = getIntent().getStringExtra("EMAIL");
        picture = getIntent().getStringExtra("PICTURE");

        Log.d("info",name+","+phone+","+email+","+picture);

        item_name = findViewById(R.id.item_name);
        item_phone = findViewById(R.id.item_phone);
        item_email = findViewById(R.id.item_email);
        item_img = findViewById(R.id.item_img);


        item_name.setText(name);
        item_phone.setText(phone);
        item_email.setText(email);




    }
}