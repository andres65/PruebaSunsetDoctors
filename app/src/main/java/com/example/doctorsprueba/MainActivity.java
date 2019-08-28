package com.example.doctorsprueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DoctorVoActivity> listaDoctores;
    RecyclerView recyclerDoctores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDoctores=new ArrayList<>();
        recyclerDoctores= (RecyclerView) findViewById(R.id.recyclerId);
        recyclerDoctores.setLayoutManager(new LinearLayoutManager(this));
        
        llenarDoctores();

        //enviar la lista al adaptador

        AdaptodorDoctorsActivity adpter=new AdaptodorDoctorsActivity(listaDoctores);
        recyclerDoctores.setAdapter(adpter);

    }

    private void llenarDoctores() {
        listaDoctores.add(new DoctorVoActivity("Jakub Antalik","Cardiologist, Chiropractor, Dentist",R.drawable.doctor));
        listaDoctores.add(new DoctorVoActivity("Aurélien Salomon","Cardiologist, Chiropractor, Dentist",R.drawable.x_rayo));
        listaDoctores.add(new DoctorVoActivity("Camilo Bejarano","Cardiologist, Chiropractor, Dentist",R.drawable.idea));
        listaDoctores.add(new DoctorVoActivity("Justin Pervorse","Cardiologist, Chiropractor, Dentist",R.drawable.historia));
        listaDoctores.add(new DoctorVoActivity("Yoga Perdana","Cardiologist, Chiropractor, Dentist",R.drawable.doctora));
        listaDoctores.add(new DoctorVoActivity("Oled Frolov","Cardiologist, Chiropractor, Dentist",R.drawable.cerebro));
        listaDoctores.add(new DoctorVoActivity("Jair Galindez","Cardiologist, Chiropractor, Dentist",R.drawable.doctores));
        listaDoctores.add(new DoctorVoActivity("Andrew Oito","Cardiologist, Chiropractor, Dentist",R.drawable.enfermero));
        listaDoctores.add(new DoctorVoActivity("Stephanie Lopera","Cardiologist, Chiropractor, Dentist",R.drawable.corazon));
    }
}
