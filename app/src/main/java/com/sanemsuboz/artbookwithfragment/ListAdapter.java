package com.sanemsuboz.artbookwithfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ArtHolder> {

    ArrayList<String> artList;
    ArrayList<Integer> idList;
    TextView rowText;

    public ListAdapter(ArrayList<String> artList, ArrayList<Integer> idList) {
        this.artList = artList;
        this.idList = idList;
    }

    @NonNull
    @Override
    public ArtHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View customView = layoutInflater.inflate(R.layout.row_recycler,parent,false);
        return new ArtHolder(customView);

    }

    @Override
    public void onBindViewHolder(@NonNull ArtHolder holder, int position) {

        rowText=holder.itemView.findViewById(R.id.rowTextView);
        rowText.setText(artList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return artList.size();
    }

    public class ArtHolder extends RecyclerView.ViewHolder {

        public ArtHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
