package model;

public class JaulaTerrestre extends Habitat{

    public JaulaTerrestre(String nombre, String ubicacion, float temperatura, float area, int capacidad) {
        super(nombre, ubicacion, temperatura, area, capacidad);
    }

    @Override
    public String ambiente() {
        return "Terrestre";
    }
    
}
