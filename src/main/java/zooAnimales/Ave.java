package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Ave extends Animal{

    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int  aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
    }

    public Ave(){}

    public static int cantidadAves(){
        return Ave.listado.size();
    }

    @Override
    public String movimiento(){
        return "volar";
    }

    public void crearHalcon(String nombre, int edad, String genero, Zona zona){
        Ave.listado.add(new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso"));
        Ave.halcones += 1;
    }

    public void crearAguila(String nombre, int edad, String genero, Zona zona){
        Ave.listado.add(new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo"));
        Ave.aguilas += 1;
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public static int getHalcones() {
        return halcones;
    }

    public static void setHalcones(int halcones) {
        Ave.halcones = halcones;
    }

    public static int getAguilas() {
        return aguilas;
    }

    public static void setAguilas(int aguilas) {
        Ave.aguilas = aguilas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
