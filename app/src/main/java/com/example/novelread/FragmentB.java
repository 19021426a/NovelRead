package com.example.novelread;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.barteksc.pdfviewer.PDFView;

public class FragmentB extends Fragment {

    PDFView pdfView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        pdfView = (PDFView) view.findViewById(R.id.pdfViewer);

        String getString = getActivity().getIntent().getStringExtra("pdfFileName");

        if (getString.equals("Chapter1")) {
            pdfView.fromAsset("Chapter1.pdf").load();
        }

        if (getString.equals("Chapter2")) {
            pdfView.fromAsset("Chapter2.pdf").load();
        }

        if (getString.equals("Chapter3")) {
            pdfView.fromAsset("Chapter3.pdf").load();
        }

        if (getString.equals("Chapter4")) {
            pdfView.fromAsset("Chapter4.pdf").load();
        }

        if (getString.equals("Chapter5")) {
            pdfView.fromAsset("Chapter5.pdf").load();
        }

        if (getString.equals("Chapter6")) {
            pdfView.fromAsset("Chapter6.pdf").load();
        }

        if (getString.equals("Chapter7")) {
            pdfView.fromAsset("Chapter7.pdf").load();
        }

        if (getString.equals("Chapter8")) {
            pdfView.fromAsset("Chapter8.pdf").load();
        }

        if (getString.equals("Chapter9")) {
            pdfView.fromAsset("Chapter9.pdf").load();
        }

        if (getString.equals("Chapter10")) {
            pdfView.fromAsset("Chapter10.pdf").load();
        }

        if (getString.equals("Chapter11")) {
            pdfView.fromAsset("Chapter11.pdf").load();
        }

        if (getString.equals("Chapter12")) {
            pdfView.fromAsset("Chapter12.pdf").load();
        }

        if (getString.equals("Chapter13")) {
            pdfView.fromAsset("Chapter13.pdf").load();
        }

        if (getString.equals("Chapter14")) {
            pdfView.fromAsset("Chapter14.pdf").load();
        }
        return view;
    }
}
