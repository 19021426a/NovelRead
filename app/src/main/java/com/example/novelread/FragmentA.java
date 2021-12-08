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

public class FragmentA extends Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chapterlist, container, false);
        String[] list = {"Chapter1",
                "Chapter2",
                "Chapter3",
                "Chapter4",
                "Chapter5",
                "Chapter6",
                "Chapter7",
                "Chapter8",
                "Chapter9",
                "Chapter10",
                "Chapter11",
                "Chapter12",
                "Chapter13",
                "Chapter14",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, list) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String string = listView.getItemAtPosition(i).toString();
                Intent intent = new Intent(getActivity().getApplicationContext(), FragmentB.class);
                intent.putExtra("pdfFileName", string);
                startActivity(intent);
            }
        });
        return view;
    }
}
