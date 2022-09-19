package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{

    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int  bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public Pez(){}

    public static int cantidadPeces(){
        return Pez.listado.size();
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public void crearSalmon(String nombre, int edad, String genero, Zona zona){
        Pez.listado.add(new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6));
        Pez.salmones += 1;
    }

    public void crearBacalao(String nombre, int edad, String genero, Zona zona){
        Pez.listado.add(new Pez(nombre, edad, "oceano", genero, zona, "gris", 6));
        Pez.bacalaos += 1;
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static void setSalmones(int salmones) {
        Pez.salmones = salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

    public static void setBacalaos(int bacalaos) {
        Pez.bacalaos = bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
