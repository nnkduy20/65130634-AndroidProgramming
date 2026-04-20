package com.example.kiemtra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau3Fragment extends Fragment {
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandSScape;



    private String mParam1;
    private String mParam2;

    public Cau3Fragment() {
        // Required empty public constructor
    }


    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<LandScape>();
        list.add(new LandScape("Cột cờ Hà Nội", "hanoi_flag_tower"));
        list.add(new LandScape("Tháp Eiffel", "eiffel_tower"));
        list.add(new LandScape("Cung điện Buckingham", "Buckinghham_palace"));
        list.add(new LandScape("Tượng nữ thần tự do", "nu_than_tu_do"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewcau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandSScape =    viewcau3.findViewById(R.id.ryCau3);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewcau3.getContext());
        recyclerViewLandSScape.setLayoutManager(layoutLinear);

        adapter = new LandScapeAdapter(viewcau3.getContext(),list);
        recyclerViewLandSScape.setAdapter(adapter);

        return viewcau3;

    }
}