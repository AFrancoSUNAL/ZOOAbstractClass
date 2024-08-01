package model;

public class Animal {
    public String nombreAnimal;
    public int edad;
    public float peso;
    public float altura;
    public String genero;
    public Especie especie;
    protected boolean alimentado;

    public Animal(String nombreAnimal, int edad, float peso, float altura, String genero, Especie especie) {
        this.nombreAnimal = nombreAnimal;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
        this.especie = especie;
        this.alimentado = true;
    }
    
    public void alimentar() {
        System.out.println("Me estoy alimentando!!!");
    }
}
