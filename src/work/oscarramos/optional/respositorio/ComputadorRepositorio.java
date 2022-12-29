package work.oscarramos.optional.respositorio;

import work.oscarramos.optional.model.Computador;
import work.oscarramos.optional.model.Fabricante;
import work.oscarramos.optional.model.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {
    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador procesador = new Procesador("Raizen",new Fabricante("AMD"));
        Computador pc = new Computador("Asus","Dash 15");
        pc.setProcesador(procesador);
        dataSource.add(pc);
        dataSource.add(new Computador("Hp","Legion"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream().filter(c -> c.getNombres().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
    }
}
