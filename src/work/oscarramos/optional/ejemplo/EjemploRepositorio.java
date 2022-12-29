package work.oscarramos.optional.ejemplo;

import work.oscarramos.optional.model.Computador;
import work.oscarramos.optional.respositorio.ComputadorRepositorio;
import work.oscarramos.optional.respositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repo = new ComputadorRepositorio();

        Optional<Computador> pc = repo.filtrar("Hp");

        if(pc.isPresent()){
            System.out.println(pc.get());
        }else{
            System.out.println("no se encontro");
        }

        repo.filtrar("Asusp").ifPresentOrElse(System.out::println,
                ()-> System.out.println("No esta presente"));



    }
}
