package clases.models;

import clases.Animal;

public class Perro extends Animal {

    private Raza raza;

    public Perro(String nombre, int edad, double peso, Raza raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    
    public String getNombre() {
            return "Soy un perrito y mi nombre es " + super.nombre;     
    }
    
    public void comunicar() {
        System.out.println("Guau Guau");
    }
     
}
