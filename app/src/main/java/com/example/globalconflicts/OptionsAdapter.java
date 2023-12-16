package com.example.globalconflicts;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OptionsAdapter  extends RecyclerView {
    public <E> OptionsAdapter(List<String> es, Object o) {
        super((Context) es);
    }

    public String getSelectedOption() {


        return null;
    }
}

