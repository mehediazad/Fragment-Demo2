package com.example.fragment_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdopter extends RecyclerView.Adapter<MyAdopter.MyViewHolder> {

    private ArrayList<User> nameList;
   // private Context context;

    public MyAdopter(ArrayList<User> nameList) {
        this.nameList = nameList;
        //this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView letterId, nameId,ammoundId;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            letterId = itemView.findViewById(R.id.letterId);
            nameId = itemView.findViewById(R.id.nameId);
            ammoundId = itemView.findViewById(R.id.ammoundId);

        }
    }


    @NonNull
    @Override
    public MyAdopter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.childlayout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdopter.MyViewHolder holder, int position) {

        User user = nameList.get(position);

        holder.letterId.setText(user.getFirst_letter());
        holder.nameId.setText(user.getName());
        holder.ammoundId.setText(user.getAmmound());


    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }



}
