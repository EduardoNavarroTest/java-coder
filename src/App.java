import clases.Veterinaria;

public class App {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria("Veterinaria", "Calle 123", "123456789");

        System.out.println(veterinaria.toString());
    }
    
}
