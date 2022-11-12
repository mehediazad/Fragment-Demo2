package com.example.fragment_demo.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment_demo.MyAdopter;
import com.example.fragment_demo.R;
import com.example.fragment_demo.User;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<User> nameList;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recyclerView);
        nameList = new ArrayList<>();

        setAdapter();
        setUserInfo();
    }
    private void setAdapter() {
        MyAdopter myAdopter = new MyAdopter(nameList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdopter);
    }
    private void setUserInfo() {
        nameList.add(new User("P","Profile Chaka", "- ZAR 450000"));
        nameList.add(new User("P","Paul Kumar","- UGK 980000"));
        nameList.add(new User("U","Uche Nagazi","+NGN 53000"));
        nameList.add(new User("G","Gradias Kurmasti","+Kes 33000"));
        nameList.add(new User("C","Chistina Chaka", "- ZAR 450000"));
        nameList.add(new User("P","Paul Kumar","- UGK 980000"));
        nameList.add(new User("U","Uche Nagazi","+NGN 53000"));
        nameList.add(new User("G","Gradias Kurmasti","+Kes 33000"));
        nameList.add(new User("C","Chistina Chaka", "- ZAR 450000"));
        nameList.add(new User("P","Paul Kumar","- UGK 980000"));
        nameList.add(new User("U","Uche Nagazi","+NGN 53000"));
        nameList.add(new User("G","Gradias Kurmasti","+Kes 33000"));
    }
}