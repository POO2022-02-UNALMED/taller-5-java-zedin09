package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int  leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static int cantidadMamiferos(){
        return Mamifero.listado.size();
    }

    public void crearCaballos(String nombre, int edad, String genero, Zona zona){
        Mamifero.listado.add(new Mamifero(nombre, edad, "pradera", genero, zona, true, 4));
        Mamifero.caballos += 1;
    }

    public void crearLeon(String nombre, int edad, String genero, Zona zona){
        Mamifero.listado.add(new Mamifero(nombre, edad, "selva", genero, zona, true, 4));
        Mamifero.leones += 1;
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
