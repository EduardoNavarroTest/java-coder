package clases.models;

import clases.Animal;

public class Caballo extends Animal {

    private TipoDeCaballo tipoDeCaballo;

    public Caballo(String nombre, int edad, double peso, TipoDeCaballo tipoDeCaballo) {
        super(nombre, edad, peso);
        this.tipoDeCaballo = tipoDeCaballo;
    }

    public TipoDeCaballo getTipoDeCaballo() {
        return tipoDeCaballo;
    }

    public void setTipoDeCaballo(TipoDeCaballo tipoDeCaballo) {
        this.tipoDeCaballo = tipoDeCaballo;
    }

    public void comunicar() {
        System.out.println("Estoy caballeteando");
    }

}
