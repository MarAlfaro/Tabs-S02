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

public class FragmentoTres extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_fragmento_tres, container, false);
        final Button btnCorreo = root.findViewById(R.id.btnCorreo);
        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"alfaromargarita556@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Me interesa tus servicios");
                startActivity(intent);
            }
        });

        return root;
    }
}