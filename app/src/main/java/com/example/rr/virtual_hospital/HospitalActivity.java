package com.example.rr.virtual_hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HospitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        final ListView myListView = (ListView)findViewById(R.id.myListView);

        final ArrayList<String> hospital= new ArrayList<String>();

        hospital.add("Chiitagone Medical Collage");
        hospital.add("Chittagong Eye Infirmary & Training Complex");
        hospital.add("Chattagram Maa-Shishu O General Hospital");
        hospital.add("Chittagong Metropolitan Hospital Pvt. Ltd.");
        hospital.add("Holy Crescent Hospital Pvt. Ltd.");
        hospital.add("Southern Medical College and Hospital");
        hospital.add("Epic Health Care");
        hospital.add("B.B.M.H");
        boolean add = hospital.add("Centre Point Hospital (Pvt)Ltd.");
        hospital.add("Chittagong Diabetic Hospital");
        hospital.add("Chittagong General Hospital");
        hospital.add("Chittagong Poly Chinic (Pvt.) Ltd");
        hospital.add("Desh Medical Services");
        hospital.add("Institute Of Community Opthalmology");
        hospital.add("Lions General Hospital");
        hospital.add("Ma Moni Hospital");
        hospital.add("Mouni Hospital & Diagnostic Centre");
        hospital.add("Panorama Hospital (Pvt) Ltd.");
        hospital.add("Public Hospital Private Limited");
        hospital.add("Upasham Hospital");
        hospital.add("Combined Military Hospital");
        hospital.add("Port Hospital");




        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,hospital);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(HospitalActivity.this, hospital[position], Toast.LENGTH_SHORT).show();

            }
        });




    }
}
