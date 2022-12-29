package work.oscarramos.optional.ejemplo;

import work.oscarramos.optional.model.Computador;
import work.oscarramos.optional.respositorio.ComputadorRepositorio;
import work.oscarramos.optional.respositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodoOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repo = new ComputadorRepositorio();

        Computador pc = repo.filtrar("Asus").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String ext = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.indexOf(".") +1))
                .orElseThrow();

        System.out.println("ext = " + ext);




    }

}
