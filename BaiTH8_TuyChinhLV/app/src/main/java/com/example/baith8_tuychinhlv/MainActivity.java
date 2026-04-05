package com.example.baith8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm tấm sườn", 25_000, "Mô tả", R.drawable.comtamsuon));
        dsMonAn.add(new MonAn("Cơm tấm sườn trứng", 35_000, "Mô tả", R.drawable.comtamssuontrung));
        dsMonAn.add(new MonAn("Cơm gà sối mỡ", 45_000, "Mô tả", R.drawable.comgasoimo));
        dsMonAn.add(new MonAn("Cơm sườn bì chả", 35_000, "Mô tả", R.drawable.comtamsuonbicha));
        dsMonAn.add(new MonAn("Cơm sườn đặc biệt", 50_000, "Mô tả", R.drawable.comtamdacbiet));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //
                MonAn monAnChon = dsMonAn.get(i);
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}