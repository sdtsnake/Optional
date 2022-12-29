package work.oscarramos.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Snake";

        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isEmpty());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        opt.ifPresent(s->{System.out.println("hola " + s);});

        nombre = "Juan";
        opt = Optional.ofNullable(nombre);
        System.out.println("opt " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse(v -> System.out.println("hola " + v),
                ()-> System.out.println("esta vacio"));


        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());














    }
}



