package controller;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Especie;
import model.JaulaAcuatica;
import model.JaulaTerrestre;

public class BDTemporal {
    
    public List<Especie> especies;
    public List<Animal> animales;
    public JaulaTerrestre jaulaTerrestre;
    public JaulaAcuatica jaulaAcuatica;
    
    public BDTemporal() {
        especies = new ArrayList<>();

        especies.add(new Especie("León", "Carnívoro", 14, "Animalia", "base64Image1"));
        especies.add(new Especie("Elefante", "Herbívoro", 70, "Animalia", "base64Image2"));
        especies.add(new Especie("Tigre", "Carnívoro", 15, "Animalia", "base64Image3"));
        especies.add(new Especie("Cebra", "Herbívoro", 25, "Animalia", "base64Image4"));
        especies.add(new Especie("Gorila", "Herbívoro", 35, "Animalia", "base64Image5"));
        especies.add(new Especie("Pingüino", "Carnívoro", 20, "Animalia", "base64Image6"));
        especies.add(new Especie("Oso Polar", "Carnívoro", 25, "Animalia", "base64Image7"));
        especies.add(new Especie("Koala", "Herbívoro", 18, "Animalia", "base64Image8"));
        especies.add(new Especie("Canguro", "Herbívoro", 23, "Animalia", "base64Image9"));
        especies.add(new Especie("Rinoceronte", "Herbívoro", 40, "Animalia", "base64Image10"));
        especies.add(new Especie("Jirafa", "Herbívoro", 25, "Animalia", "base64Image11"));
        especies.add(new Especie("Lobo", "Carnívoro", 14, "Animalia", "base64Image12"));
        especies.add(new Especie("Tortuga", "Herbívoro", 100, "Animalia", "base64Image13"));
        especies.add(new Especie("Águila", "Carnívoro", 20, "Animalia", "base64Image14"));
        especies.add(new Especie("Panda", "Herbívoro", 20, "Animalia", "base64Image15"));
        especies.add(new Especie("Hiena", "Carnívoro", 25, "Animalia", "base64Image16"));
        especies.add(new Especie("Zorro", "Carnívoro", 14, "Animalia", "base64Image17"));
        especies.add(new Especie("Hipopótamo", "Herbívoro", 45, "Animalia", "base64Image18"));
        especies.add(new Especie("Cocodrilo", "Carnívoro", 70, "Animalia", "base64Image19"));
        especies.add(new Especie("Orangután", "Herbívoro", 40, "Animalia", "base64Image20"));

        animales = new ArrayList<>();
        animales.add(new Animal("Simba", 5, 190.5f, 1.2f, "Macho", especies.get(0)));
        animales.add(new Animal("Dumbo", 10, 5400f, 3.0f, "Macho", especies.get(1)));
        animales.add(new Animal("Shere Khan", 8, 220.4f, 1.1f, "Macho", especies.get(2)));
        animales.add(new Animal("Marty", 4, 350f, 1.5f, "Macho", especies.get(3)));
        animales.add(new Animal("Harambe", 15, 200f, 1.7f, "Macho", especies.get(4)));
        animales.add(new Animal("Skipper", 7, 23.5f, 0.45f, "Macho", especies.get(5)));
        animales.add(new Animal("Nanook", 12, 450f, 1.3f, "Hembra", especies.get(6)));
        animales.add(new Animal("Blinky", 6, 13.5f, 0.8f, "Hembra", especies.get(7)));
        animales.add(new Animal("Joey", 9, 85f, 1.4f, "Macho", especies.get(8)));
        animales.add(new Animal("Rino", 20, 2300f, 1.8f, "Macho", especies.get(9)));
        animales.add(new Animal("Geoffrey", 11, 800f, 2.5f, "Macho", especies.get(10)));
        animales.add(new Animal("Akela", 13, 70f, 0.9f, "Macho", especies.get(11)));
        animales.add(new Animal("Shelly", 100, 100f, 0.5f, "Hembra", especies.get(12)));
        animales.add(new Animal("Freedom", 5, 6.5f, 0.3f, "Hembra", especies.get(13)));
        animales.add(new Animal("Po", 6, 100f, 1.2f, "Macho", especies.get(14)));
        animales.add(new Animal("Shenzi", 7, 60f, 0.85f, "Hembra", especies.get(15)));
        animales.add(new Animal("Tod", 4, 6.2f, 0.4f, "Macho", especies.get(16)));
        animales.add(new Animal("Henry", 15, 3000f, 1.6f, "Macho", especies.get(17)));
        animales.add(new Animal("Snap", 20, 450f, 1.7f, "Macho", especies.get(18)));
        animales.add(new Animal("Tang", 12, 90f, 1.0f, "Macho", especies.get(19)));
        
        ArrayList <Animal> animalesTerrestres = new ArrayList<>();
        animalesTerrestres.add(animales.get(0));
        animalesTerrestres.add(animales.get(1));
        animalesTerrestres.add(animales.get(2));
        animalesTerrestres.add(animales.get(3));
        animalesTerrestres.add(animales.get(4));
        animalesTerrestres.add(animales.get(6));
        animalesTerrestres.add(animales.get(7));
        animalesTerrestres.add(animales.get(8));
        animalesTerrestres.add(animales.get(9));
        animalesTerrestres.add(animales.get(10));
        animalesTerrestres.add(animales.get(11));
        animalesTerrestres.add(animales.get(13));
        animalesTerrestres.add(animales.get(14));
        animalesTerrestres.add(animales.get(15));
        animalesTerrestres.add(animales.get(16));
        animalesTerrestres.add(animales.get(19));
        
        ArrayList <Animal> animalesAcuaticos = new ArrayList<>();
        animalesAcuaticos.add(animales.get(5));
        animalesAcuaticos.add(animales.get(12));
        animalesAcuaticos.add(animales.get(17));
        animalesAcuaticos.add(animales.get(18));
        
        jaulaTerrestre = new JaulaTerrestre("Jaula 1", "Bloque A", 27.0f, 205.4f, 40);
        
        for(Animal animal : animalesTerrestres){
            jaulaTerrestre.ingresar(animal);
        }
        
        jaulaAcuatica = new JaulaAcuatica("Jaula 1", "Bloque B", 28.2f, 400.0f, 60);
        
        for(Animal animal : animalesAcuaticos){
            jaulaAcuatica.ingresar(animal);
        }
    
    }

}
