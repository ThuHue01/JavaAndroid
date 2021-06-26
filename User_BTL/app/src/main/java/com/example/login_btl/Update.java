package com.example.login_btl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Update extends AppCompatActivity {
    private TextView tvMsv, tvName, tvGender, tvSdt,
            tvAddr, tvDate, tvMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        tvMsv = (TextView) findViewById(R.id.tv_msv);
        tvName = (TextView) findViewById(R.id.tv_name);
        tvGender = (TextView) findViewById(R.id.tv_gender);
        tvSdt = (TextView) findViewById(R.id.tv_sdt);
        tvAddr = (TextView) findViewById(R.id.tv_addr);
        tvDate = (TextView) findViewById(R.id.tv_date);
        tvMail = (TextView) findViewById(R.id.tv_mail);
        setDataByExtras();

    }

    public void setDataByExtras(){
        Intent intent = getIntent();
        String msv = intent.getStringExtra(MainActivity.MSV);
        String name = intent.getStringExtra(MainActivity.NAME);
        String gender = intent.getStringExtra(MainActivity.GENDER);
        String sdt = intent.getStringExtra(MainActivity.SDT);
        String addr = intent.getStringExtra(MainActivity.ADDRESS);
        String date = intent.getStringExtra(MainActivity.DATE);
        String mail = intent.getStringExtra(MainActivity.MAIL);

        tvMsv.setText(msv);
        tvName.setText(name);
        tvGender.setText(gender);
        tvSdt.setText(sdt);
        tvAddr.setText(addr);
        tvDate.setText(date);
        tvMail.setText(mail);
    }
}