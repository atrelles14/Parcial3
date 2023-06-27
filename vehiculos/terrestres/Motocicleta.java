package vehiculos.terrestres;
import vehiculos.vehiculosTerrestres;

public class Motocicleta extends vehiculosTerrestres {
    public Motocicleta(String color, String marca, String modelo, int año, String placa) {
        super(color, marca, modelo, año, placa);
    }

    protected String obtenerRegistroOPlaca() {
    return placa != null ? placa : "----";
}

    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    public void frenar() {
        System.out.println("El coche está frenando.");
    }
}
