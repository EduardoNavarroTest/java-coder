import clases.Veterinaria;
import clases.models.Caballo;
import clases.models.Gato;
import clases.models.Perro;
import clases.models.Raza;
import clases.models.TipoDeCaballo;

public class App {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria("Veterinaria", "Calle 123", "123456789");

        Perro miPerro = new Perro("Fiufiu", 3, 10.5, Raza.CALLEJERO);
        Gato miGato = new Gato("Miau", 2, 4.5, Raza.CALLEJERO);
        Caballo miCaballo = new Caballo("Caballo", 5, 100, TipoDeCaballo.DEPORTIVO);

        System.out.println(miPerro.getNombre());
        System.out.println("Edad: " + miGato.getEdad());
        System.out.println(miCaballo.getTipoDeCaballo());
        System.out.println(veterinaria.toString());
        miCaballo.comunicar();

        veterinaria.agregarAnimal(miCaballo);
        veterinaria.agregarAnimal(miGato);
        veterinaria.agregarAnimal(miPerro);

        veterinaria.mostrarAnimales();
    }
    
}


/* Voy por el minuto 40 del video */