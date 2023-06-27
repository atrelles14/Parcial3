package vehiculos.terrestres;
import vehiculos.vehiculosTerrestres;

public class Coche extends vehiculosTerrestres {
    public Coche(String color, String marca, String modelo, int año, String placa) {
        super(color, marca, modelo, año, placa);
    }

    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    public void frenar() {
        System.out.println("El coche está frenando.");
    }

    protected String obtenerRegistroOPlaca() {
    return placa != null ? placa : "----";
    }
}
