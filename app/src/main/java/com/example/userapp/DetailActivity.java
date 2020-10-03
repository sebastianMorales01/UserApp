package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    String name,phone,email,picture;

    private TextView detail_name,detail_phone,detail_email;
    private ImageView detail_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = getIntent().getStringExtra("NAME");
        phone = getIntent().getStringExtra("PHONE");
        email = getIntent().getStringExtra("EMAIL");
        picture = getIntent().getStringExtra("PICTURE");

        Log.d("info",name+","+phone+","+email+","+picture);

        detail_name = findViewById(R.id.detail_name);
        detail_phone = findViewById(R.id.detail_phone);
        detail_email = findViewById(R.id.detail_email);
        detail_img = findViewById(R.id.detail_img);


        detail_name.setText(name);
        detail_phone.setText(phone);
        detail_email.setText(email);

        Glide.with(this).load(picture).into(detail_img);




    }
}