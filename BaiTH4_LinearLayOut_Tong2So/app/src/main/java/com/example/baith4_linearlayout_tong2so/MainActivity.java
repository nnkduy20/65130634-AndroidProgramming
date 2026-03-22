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
    //
  public   void Xulycong(View v){
        //xuly

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //t
        float Tong = soA + soB;
        //kq

        //
        String chuoiKQ = String.valueOf(Tong);
        //
        editTextKQ.setText(chuoiKQ);

    }
    public  void Xulytru(View v){
        //xuly

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //t
        float Hieu = soA - soB;
        //kq

        //
        String chuoiKQ = String.valueOf(Hieu);
        //
        editTextKQ.setText(chuoiKQ);

    }
    public void Xulynhan(View v){
        //xuly

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //t
        float Nhan = soA*soB;
        //kq

        //
        String chuoiKQ = String.valueOf(Nhan);
        //
        editTextKQ.setText(chuoiKQ);
    }
    public void Xulychia(View v){
        //xuly

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);


        //t
        float Thuong = soA / soB;
        //kq

        //
        String chuoiKQ = String.valueOf(Thuong);
        //
        editTextKQ.setText(chuoiKQ);

    }

}