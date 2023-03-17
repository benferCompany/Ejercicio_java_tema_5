import clases.Coche;
import implement.CocheCRUDImpl;
import interfaces.CocheCRUD;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {

        Coche coche = new Coche("Rojo","Toyota","Automovil");
        Coche camion = new Coche("Blanco","Scania","Camión");

        cocheCRUD.save(coche);
        cocheCRUD.save(camion);


        for (Coche automovil: cocheCRUD.findAll()){
            System.out.println(automovil.getColor());
            System.out.println(automovil.getTipo());
            System.out.println(automovil.getMarca());
            System.out.println("-----------------------------------------------");
        }

        cocheCRUD.delete(coche);

        for (Coche automovil: cocheCRUD.findAll()){
            System.out.println(automovil.getColor());
            System.out.println(automovil.getTipo());
            System.out.println(automovil.getMarca());
            System.out.println("-----------------------------------------------");
        }


    }
}