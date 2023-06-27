package vehiculos;

public abstract class vehiculosAcuaticos extends padreVehiculo{
    protected String registro;
    protected abstract String obtenerRegistroOPlaca();

    public vehiculosAcuaticos(String color, String marca, String modelo, int año, String registro) {
        super(color, marca, modelo, año);
        this.registro = registro;
    }

    @Override
    public void imprimirDatos() {
        String[] headers = {"Tipo", "Color", "Marca", "Modelo", "Año", "Registro"};
        String[] data = {getClass().getSimpleName(), color, marca, modelo, String.valueOf(año), obtenerRegistroOPlaca()};
        imprimir.imprimirTabla(headers, data);
    }
}
