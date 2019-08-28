package com.example.doctorsprueba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptodorDoctorsActivity extends RecyclerView.Adapter<AdaptodorDoctorsActivity.ViewHolderDoctors> {

    //Generar lista de doctores
    ArrayList<DoctorVoActivity> listaDoctors;

    //Constructor que recibe la lista
    public AdaptodorDoctorsActivity(ArrayList<DoctorVoActivity> listaDoctors) {
        this.listaDoctors = listaDoctors;
    }

    @NonNull
    @Override
    public ViewHolderDoctors onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_doctors,null,false);
        return new ViewHolderDoctors(view);
    }


    //llenamos los datos
    @Override
    public void onBindViewHolder(@NonNull ViewHolderDoctors holder, int position) {

        holder.etiNombre.setText(listaDoctors.get(position).getNombre());
        holder.etiInformation.setText(listaDoctors.get(position).getInfo());
        holder.imagen.setImageResource(listaDoctors.get(position).getImagen());


    }

    //tamaño de la lista
    @Override
    public int getItemCount() {
        return listaDoctors.size();
    }

    public class ViewHolderDoctors extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformation;
        ImageView imagen;

        public ViewHolderDoctors(@NonNull View itemView) {
            super(itemView);
            etiNombre= (TextView) itemView.findViewById(R.id.idNombre);
            etiInformation= (TextView) itemView.findViewById(R.id.idInfo);
            imagen= (ImageView) itemView.findViewById(R.id.idImg);
        }
    }
}
