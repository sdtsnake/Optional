package work.oscarramos.optional.model;

import java.util.Optional;

public class Procesador {
    private String nombre;
    private Fabricante fabricante;

    public String getNombre() {
        return nombre;
    }

    public Optional<Fabricante> getFabricante() {
        return Optional.ofNullable(fabricante);
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Procesador(String nombre, Fabricante fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Procesador(String nombre) {
        this.nombre = nombre;
    }

    public Procesador() {
    }
}
