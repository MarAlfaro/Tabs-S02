package com.yancy.tabsactivity_s02.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yancy.tabsactivity_s02.R;


public class FragmentoDos extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_fragmento_dos, container, false);
        final Button btnUni = root.findViewById(R.id.btnUni);

        btnUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_VIEW);
                String uri = "https://www.univo.edu.sv/";
                sendIntent.setData(Uri.parse(uri));
                startActivity(sendIntent);
            }
        });
        return root;
    }
}