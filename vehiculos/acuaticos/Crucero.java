package vehiculos.acuaticos;
import vehiculos.vehiculosAcuaticos;

public class Crucero extends vehiculosAcuaticos {
    public Crucero(String color, String marca, String modelo, int año, String registro) {
        super(color, marca, modelo, año, registro);
    }

    protected String obtenerRegistroOPlaca() {
    return registro != null ? registro : "----";
}

    public void acelerar() {
        System.out.println("La lancha está acelerando.");
    }

    public void frenar() {
        System.out.println("La lancha está frenando.");
    }
}