package model;

public class Especie implements SerVivo {
    public String nombreEspecie;
    public String clasificacion;
    public int esperanza;
    public String reino;
    public String imagen;

    public Especie(String nombreEspecie, String clasificacion, int esperanza, String reino, String imagen) {
        this.nombreEspecie = nombreEspecie;
        this.clasificacion = clasificacion;
        this.esperanza = esperanza;
        this.reino = reino;
        this.imagen = imagen;
    }
    
    @Override
    public void comer() {
        System.out.println("Por ahora estoy comiendo así");
    }
    
    @Override
    public void sonar() {
        System.out.println("Por ahora estoy sonando así");
    }
}
