package com.example.doctorsprueba;

public class DoctorVoActivity {

    private String nombre;
    private String info;
    private int imagen;


    //clase para alimentar la lista del RecyclerView
    public DoctorVoActivity(){

    }

    //constructor
    public DoctorVoActivity(String nombre, String info, int imagen) {
        this.nombre = nombre;
        this.info = info;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
