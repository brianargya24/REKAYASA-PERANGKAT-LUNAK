package com.example.asus.marion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Daftarbis extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Kelas;
    private ArrayList<String> Jam;
    private ArrayList<String> Harga;

    private String[] NKelas = {
           "Bussines Class", "Economy Class"};


    private String[] PJam = {
            "07:00", "09:00" , "10:00" , "12:00" , "14:00" , "16:00" , "18:00" , "20:00"};

    private String[] PHarga = {
            "Rp 100.000", "Rp 150.000" , "Rp 200.000" };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarbis);

        Kelas = new ArrayList<>();
        Jam = new ArrayList<>();
        Harga = new ArrayList<>();
        DaftarItem();


        rvView = (RecyclerView) findViewById(R.id.Rview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(Kelas, Jam, Harga);
        rvView.setAdapter(adapter);

    }

    private void DaftarItem() {
        for (int w = 0; w < NKelas.length; w++) {
            Kelas.add(NKelas[w]);
            Jam.add(PJam[w]);
            Harga.add(PHarga[w]);
        }
    }
}