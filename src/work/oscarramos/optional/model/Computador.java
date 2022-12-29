package work.oscarramos.optional.model;

import java.util.Optional;

public class Computador {
    private String nombres;
    private String modelo;

    private Procesador procesador;

    public String getNombres() {
        return nombres;
    }

    public Optional<Procesador> getProcesador() {
        return Optional.ofNullable(procesador);
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public Computador() {
    }

    public Computador(String nombres, String modelo) {
        this.nombres = nombres;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return nombres + ", " + modelo;
    }
}
