package com.example.login_btl;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    EditText edtMsv, edtName, edtGender, edtSdt,
            edtAddr, edtDate, edtMail;
    Button button;

    public static final String MSV = "MSV";
    public static final String NAME = "NAME";
    public static final String GENDER = "GENDER";
    public static final String SDT = "SDT";
    public static final String ADDRESS = "ADDRESS";
    public static final String DATE = "DATE";
    public static final String MAIL = "MAIL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        edtMsv = (EditText) findViewById(R.id.msv);
        edtName = (EditText) findViewById(R.id.name);
        edtGender = (EditText) findViewById(R.id.gender);
        edtSdt = (EditText) findViewById(R.id.sdt);
        edtAddr = (EditText) findViewById(R.id.addr);
        edtDate = (EditText) findViewById(R.id.date);
        edtMail = (EditText) findViewById(R.id.mail);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msv = edtMsv.getText().toString();
                String name = edtName.getText().toString();
                String gender = edtGender.getText().toString();
                String sdt = edtSdt.getText().toString();
                String addr = edtAddr.getText().toString();
                String date = edtDate.getText().toString();
                String mail = edtMail.getText().toString();
                byExtras(msv, name, gender, sdt, addr, date, mail);

            }
        });


        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.img);
        Bitmap circularBitmap = ImageConvert.getRoundedCornerBitmap(bitmap, 100);

        ImageView circularImageView = (ImageView) findViewById(R.id.imageView);
        circularImageView.setImageBitmap(circularBitmap);
    }
    public void byExtras(String msv, String name, String gender, String sdt,
                         String addr, String date, String mail){
        Intent intent = new Intent(MainActivity.this, Update.class);
        intent.putExtra(MSV, msv);
        intent.putExtra(NAME, name);
        intent.putExtra(GENDER, gender);
        intent.putExtra(SDT, sdt);
        intent.putExtra(ADDRESS, addr);
        intent.putExtra(DATE, date);
        intent.putExtra(MAIL, mail);
        startActivity(intent);
    }

}