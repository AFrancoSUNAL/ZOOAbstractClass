package model;

import java.util.ArrayList;

public abstract class Habitat {
    public String nombre;
    public String ubicacion;
    public float temperatura;
    public float area;
    protected int capacidad;
    public ArrayList<Animal> animales;

    public Habitat(String nombre, String ubicacion, float temperatura, float area, int capacidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.temperatura = temperatura;
        this.area = area;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
    }
    
    public abstract void ambiente();
    
    public void ingresar(Animal animal) {
        if (animales.size() >= capacidad){
            throw new UnsupportedOperationException("");
        }
        animales.add(animal);
    }
}
