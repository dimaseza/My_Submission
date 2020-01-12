package com.daivers.submission;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListKlubAdapter extends RecyclerView.Adapter<ListKlubAdapter.ListViewHolder>{
    private ArrayList<Klub> listKlub;

    private Context mContext;

    public ListKlubAdapter(ArrayList<Klub> list){
        this.listKlub = list;
    }

    public ListKlubAdapter(Context CContext){
        this.mContext = CContext;
    }


    public interface OnItemClickCallback{
        void onItemClicked(Klub clickClub);
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {

        Klub klub = listKlub.get(position);
        Glide.with(holder.itemView.getContext())
                .load(klub.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgP);
        holder.klubName.setText(klub.getNama());
        holder.klubDetail.setText(klub.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listKlub.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listKlub.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgP;
        TextView klubName, klubDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgP = itemView.findViewById(R.id.image_photo);
            klubName = itemView.findViewById(R.id.item_klub);
            klubDetail = itemView.findViewById(R.id.detail_item);

        }
    }



}
