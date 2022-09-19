package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{

    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int  serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public Reptil(){};

    public static int cantidadReptiles(){
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public void crearIguana(String nombre, int edad, String genero, Zona zona){
        Reptil.listado.add(new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3));
        Reptil.iguanas += 1;
    }

    public void crearSerpiente(String nombre, int edad, String genero, Zona zona){
        Reptil.listado.add(new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1));
        Reptil.serpientes += 1;
    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public static int getIguanas() {
        return iguanas;
    }

    public static void setIguanas(int iguanas) {
        Reptil.iguanas = iguanas;
    }

    public static int getSerpientes() {
        return serpientes;
    }

    public static void setSerpientes(int serpientes) {
        Reptil.serpientes = serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}