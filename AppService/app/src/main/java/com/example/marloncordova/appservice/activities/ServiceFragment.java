package com.example.marloncordova.appservice.activities;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marloncordova.appservice.R;
import com.example.marloncordova.appservice.adapters.ServiceAdapter;
import com.example.marloncordova.appservice.models.Service;
import com.example.marloncordova.appservice.service.ServiceContent;

import java.util.ArrayList;
import java.util.List;



public class ServiceFragment extends Fragment {

    RecyclerView servicesRecyclerView;
    RecyclerView.LayoutManager servicesLayoutManager;
    ServiceAdapter serviceAdapter;
    List<Service> services;

    private OnFragmentInteractionListener mListener;

    public ServiceFragment() {
        // Required empty public constructor

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_service, container, false);

        ServiceContent service = new ServiceContent(this.getContext());
        services = service.getService();
        servicesLayoutManager = new LinearLayoutManager(this.getContext());
        serviceAdapter = new ServiceAdapter();
        serviceAdapter.setService(services);
        servicesRecyclerView = (RecyclerView)view.findViewById(R.id.servicesRecyclerView);
        servicesRecyclerView.setLayoutManager(servicesLayoutManager);
        servicesRecyclerView.setAdapter(serviceAdapter);

        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
