package work.oscarramos.optional.respositorio;

import work.oscarramos.optional.model.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);
}
