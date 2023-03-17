package implement;

import clases.Coche;
import interfaces.CocheCRUD;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<Coche> coches = new ArrayList<>();
    @Override
    public void save(Coche coche) {

        coches.add(coche);

    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
        System.out.println("El objeto se removio con exito");
    }
}
