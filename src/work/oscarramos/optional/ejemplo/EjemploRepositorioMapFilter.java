package work.oscarramos.optional.ejemplo;

import work.oscarramos.optional.model.Computador;
import work.oscarramos.optional.model.Fabricante;
import work.oscarramos.optional.model.Procesador;
import work.oscarramos.optional.respositorio.ComputadorRepositorio;
import work.oscarramos.optional.respositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repo = new ComputadorRepositorio();

        String fabricante = repo.filtrar("Asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(f-> "AMD".equalsIgnoreCase(f.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(fabricante);

    }

}
