package model;

public class JaulaAcuatica extends Habitat {

    public JaulaAcuatica(String nombre, String ubicacion, float temperatura, float area, int capacidad) {
        super(nombre, ubicacion, temperatura, area, capacidad);
    }

    @Override
    public String ambiente() {
        return "Acuatica";
    }
    
}
