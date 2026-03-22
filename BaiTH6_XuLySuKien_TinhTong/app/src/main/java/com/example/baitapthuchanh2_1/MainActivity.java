package com.example.baitapthuchanh2_1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XulyCong(View view){
            //tim tham chieu tap tin xml
          EditText editTextSoA =  findViewById(R.id.edtA);
          EditText   editTextSoB =  findViewById(R.id.edtB);
          EditText   editTextKetQua =  findViewById(R.id.edtKQ);

          //lay du lieu
            String strA =  editTextSoA.getText().toString();
            String strB =  editTextSoB.getText().toString();

            //chuyen du lieu
            int so_A = Integer.parseInt(strA);
            int so_B = Integer.parseInt(strB);

            // tinh toan theo yeu caau
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        // hien ra amann hinh
        editTextKetQua.setText(strTong);


    }
}