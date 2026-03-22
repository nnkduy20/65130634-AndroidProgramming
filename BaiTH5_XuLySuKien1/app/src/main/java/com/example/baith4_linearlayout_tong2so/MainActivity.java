package com.example.baith4_linearlayout_tong2so;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//khai bao
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;

    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        /// gan bo lang nghe
        View.OnClickListener boLangngheCong = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //xu ly cong
                XULY_CONG();

            }
        };
        nutCong.setOnClickListener(boLangngheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tru
                XULY_TRU();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nhan
                XULY_NHAN();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //chia
                XULY_CHIA();

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
        void TimDieuKhien (){
            editTextSo1 = (EditText)findViewById(R.id.edtSo1);
            editTextSo2 = (EditText)findViewById(R.id.edtSo2);
            editTextKQ = (EditText)findViewById(R.id.edtKetQua);
            nutCong = (Button) findViewById(R.id.btnCong);
            nutTru = (Button) findViewById(R.id.btnTru);
            nutNhan = (Button) findViewById(R.id.btnNhan);
            nutChia = (Button) findViewById(R.id.btnChia);
        }

        void XULY_CONG(){
        //
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 + num2;
            String chuoiKQ = String.valueOf(tong);
            editTextKQ.setText(chuoiKQ);
    }
        void XULY_TRU(){
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 - num2;
            String chuoiKQ = String.valueOf(tong);
            editTextKQ.setText(chuoiKQ);

        }
        void XULY_NHAN(){
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 * num2;
            String chuoiKQ = String.valueOf(tong);
            editTextKQ.setText(chuoiKQ);

        }
        void XULY_CHIA(){
            String so1 = editTextSo1.getText().toString();
            String so2 = editTextSo2.getText().toString();
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 / num2;
            String chuoiKQ = String.valueOf(tong);
            editTextKQ.setText(chuoiKQ);

        }
}