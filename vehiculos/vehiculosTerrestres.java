package vehiculos;

public abstract class vehiculosTerrestres extends padreVehiculo{
    protected String placa;
    protected abstract String obtenerRegistroOPlaca();
    
    public vehiculosTerrestres(String color, String marca, String modelo, int año, String placa) {
        super(color, marca, modelo, año);
        this.placa = placa;
    }

    @Override
    public void imprimirDatos() {
        String[] headers = {"Tipo", "Color", "Marca", "Modelo", "Año", "Placa"};
        String[] data = {getClass().getSimpleName(), color, marca, modelo, String.valueOf(año), obtenerRegistroOPlaca()};
        imprimir.imprimirTabla(headers, data);
    }
}
