package com.android.recyclerview.uts.prakmobpro;

import com.android.recyclerview.uts.prakmobpro.R;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> arrayList;
    private ArrayList<Integer> imagesList;

    public RecyclerViewAdapter(ArrayList<String> arrayList, ArrayList<Integer> imagesList){
        this.arrayList = arrayList;
        this.imagesList = imagesList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView Title, SubTitle;
        private ImageView Images;
        private RelativeLayout ItemList;

        public ViewHolder(View itemView) {
            super(itemView);
            Title = itemView.findViewById(R.id.app_title);
            SubTitle = itemView.findViewById(R.id.app_subtitle);
            Images = itemView.findViewById(R.id.app_images);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final String Nama = arrayList.get(position);
        holder.Title.setText(Nama);
        int total = position + 1;
        holder.SubTitle.setText("Orang Ke: "+total);
        holder.Images.setImageResource(imagesList.get(position));
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Nama Orang Ini: "+Nama, Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
