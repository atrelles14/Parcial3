package vehiculos.acuaticos;
import vehiculos.vehiculosAcuaticos;

public class Lancha extends vehiculosAcuaticos {
    public Lancha(String color, String marca, String modelo, int año, String registro) {
        super(color, marca, modelo, año, registro);
    }

    public void acelerar() {
        System.out.println("La lancha está acelerando.");
    }

    public void frenar() {
        System.out.println("La lancha está frenando.");
    }

    protected String obtenerRegistroOPlaca() {
    return registro != null ? registro : "----";
    }
}