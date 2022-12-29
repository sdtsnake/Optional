package work.oscarramos.optional.ejemplo;

import work.oscarramos.optional.model.Computador;
import work.oscarramos.optional.respositorio.ComputadorRepositorio;
import work.oscarramos.optional.respositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodoOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repo = new ComputadorRepositorio();

        Computador pc = repo.filtrar("Asus").orElse(ValorDefecto());

        System.out.println(pc);

        pc = repo.filtrar("Hp").orElseGet(() -> ValorDefecto());

        System.out.println(pc);

    }

    public static Computador ValorDefecto(){
        System.out.println("Generando valor por defecto");
        return new Computador("MSI", "Katana");
    }

}
