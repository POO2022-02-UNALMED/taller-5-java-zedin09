package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal {

    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int  salamandras;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, Boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
    }

    public Anfibio(){
        Anfibio.listado.add(this);
    }

    public static int cantidadAnfibios(){
        if (Anfibio.listado != null){
            return Anfibio.listado.size();
        }
        else{return 0;}
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        Anfibio.listado.add(rana);
        Anfibio.ranas += 1;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        Anfibio.listado.add(salamandra);
        Anfibio.salamandras += 1;
        return salamandra;
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public static int getRanas() {
        return ranas;
    }

    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }

    public static int getSalamandras() {
        return salamandras;
    }

    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public Boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }
}
