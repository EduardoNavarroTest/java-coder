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
     
}
