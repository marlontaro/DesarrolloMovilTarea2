package com.example.marloncordova.appservice.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marloncordova.appservice.R;
import com.example.marloncordova.appservice.models.Service;
import com.example.marloncordova.appservice.service.ServiceContent;

public class ServiceViewActivity extends AppCompatActivity {
    TextView nameTextView;
    TextView descriptionTextView;
    TextView customerTextView;
    ImageView pictureImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_view);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        pictureImageView = (ImageView) findViewById(R.id.pictureImageView);
        customerTextView= (TextView) findViewById(R.id.customerTextView);

        ServiceContent serviceContent = new ServiceContent(this);
        Service service =
                serviceContent.getService().get(getIntent().getExtras().getInt("currentPosition"));
        nameTextView.setText(service.getName());
        descriptionTextView.setText(service.getDescription());
        pictureImageView.setImageResource(service.getImage());
        customerTextView.setText(service.getCustomer());
    }
}
