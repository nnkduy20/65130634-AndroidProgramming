package com.example.kiemtra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1Fragment extends Fragment {
    EditText editText_Met;
    EditText editText_KiloMet;
    Button button_chuyen;

    public Cau1Fragment() {
        // Required empty public constructor
    }


    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewcau1 = inflater.inflate(R.layout.fragment_cau1, container,false);
        //
        editText_Met =  viewcau1.findViewById(R.id.editSoMet);
        editText_KiloMet =  viewcau1.findViewById(R.id.editsoKm);
        button_chuyen =  viewcau1.findViewById(R.id.btnDoi);
        button_chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dulieuMet = editText_Met.getText().toString();
                String dulieuKilomet = editText_KiloMet.getText().toString();
                if(!dulieuMet.isEmpty()){
                    Toast.makeText(viewcau1.getContext(), "m->km", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(viewcau1.getContext(), "km->m", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return viewcau1;
    }
}