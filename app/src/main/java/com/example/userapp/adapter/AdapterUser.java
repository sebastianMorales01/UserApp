package com.example.userapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.userapp.R;
import com.example.userapp.model.User;

import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.UserHolder>{

    public Activity activity;
    public List<User> list;
    public int item_users;

    public AdapterUser(Activity activity, List<User> list, int item_users) {
        this.activity = activity;
        this.list = list;
        this.item_users = item_users;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(item_users,parent,false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        User user = list.get(position);
        holder.item_name.setText(user.name+" "+user.last);
        holder.item_phone.setText(user.phone);
        holder.item_email.setText(user.email);
        Glide.with(activity).load(user.thumbnail).into(holder.item_img);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder{

        public ImageView item_img;
        public TextView item_name, item_phone, item_email;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            item_img = itemView.findViewById(R.id.item_img);
            item_name = itemView.findViewById(R.id.item_name);
            item_phone = itemView.findViewById(R.id.item_phone);
            item_email = itemView.findViewById(R.id.item_email);
        }
    }
}
