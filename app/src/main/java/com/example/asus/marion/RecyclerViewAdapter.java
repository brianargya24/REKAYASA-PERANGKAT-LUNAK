package com.example.asus.marion;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 3/24/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvKelas,rvHarga,rvJam;
    public RecyclerViewAdapter(ArrayList<String> kelas, ArrayList<String> jam, ArrayList<String> harga) {
        rvKelas = kelas;
        rvHarga = harga;
        rvJam = jam;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvKelas;
        public TextView tvHarga;
        public TextView tvJam;
        private Button button;

        private Context context;
        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            tvKelas = (TextView) itemView.findViewById(R.id.tittle);
            tvJam = (TextView) itemView.findViewById(R.id.sub_tittle);
            tvHarga = (TextView) itemView.findViewById(R.id.harga);
           button = (Button) itemView.findViewById(R.id.buttonplh);

           button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(context,DummyActivity.class);

               }
           });


    }
}
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vholder = new ViewHolder(v);
        return vholder;
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        final String name = rvJam.get(position);
        final String harga = rvKelas.get(position);
        final String test = rvHarga.get(position);
        holder.tvKelas.setText(name);
        holder.tvJam.setText(harga);
        holder.tvHarga.setText(test);


    }@Override
    public int getItemCount() {
        return rvKelas.size();
    }}
