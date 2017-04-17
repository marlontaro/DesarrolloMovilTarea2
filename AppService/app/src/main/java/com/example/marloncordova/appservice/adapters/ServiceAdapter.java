package com.example.marloncordova.appservice.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.marloncordova.appservice.R;
import com.example.marloncordova.appservice.activities.ServiceViewActivity;
import com.example.marloncordova.appservice.models.Service;

import java.util.List;
import java.util.StringTokenizer;


public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ViewHolder> {
    private List<Service> services;
    public void setService(List<Service> service) { this.services = service; }

    @Override
    public ServiceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.service_source,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ServiceAdapter.ViewHolder holder, final int position) {
        holder.nameTextView.setText(services.get(position).getName());
        holder.logoImageView.setImageResource(services.get(position).getImage());
        holder.serviceCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Log.d("SOENAPP",String.valueOf(position));
                Bundle bundle = new Bundle();
                bundle.putInt("currentPosition", position);
                Intent serviceIntent = new Intent(view.getContext(), ServiceViewActivity.class);
                serviceIntent.putExtras(bundle);
                view.getContext().startActivity(serviceIntent);
              /*  Bundle bundle = new Bundle();
                bundle.putInt("currentPosition", position);
                Intent iconIntent = new Intent(view.getContext(), IconActivity.class);
                iconIntent.putExtras(bundle);
                view.getContext().startActivity(iconIntent);*/
            }
        });
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView serviceCardView;
        ImageView logoImageView;
        TextView nameTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            serviceCardView = (CardView) itemView.findViewById(R.id.serviceCardView);
            logoImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
        }
    }
}
