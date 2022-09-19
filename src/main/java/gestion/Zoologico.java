package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zona = new ArrayList<>();

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zona) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zona = zona;
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(){}

    public void agregarZonas(Zona zona){
        this.zona.add(zona);
    }

    public int cantidadTotalAnimales(){
        int cantidadTotal = 0;
        for (Zona zona: this.zona) {
            cantidadTotal += zona.cantidadAnimales();
        }
        return cantidadTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
    }
}
