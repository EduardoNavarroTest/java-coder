package clases;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Animal> animales = new ArrayList<>();
  
    public Veterinaria(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + " - " + animal.getEdad() + " anios - " + animal.getPeso() + " kg");
        }

        this.animales.forEach(x -> System.out.println(x));
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }
    
    

}
