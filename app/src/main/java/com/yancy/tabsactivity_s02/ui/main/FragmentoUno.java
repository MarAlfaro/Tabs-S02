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

public class FragmentoUno extends Fragment{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_fragmento_uno, container, false);
        final Button btnW = root.findViewById(R.id.btnW);

        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_VIEW);
                String uri = "whatsapp://send?phone=50372413543&text=Hola Yancy, quisiera conocer mas de ti";
                sendIntent.setData(Uri.parse(uri));
                startActivity(sendIntent);
            }
        });
        return root;
    }
}