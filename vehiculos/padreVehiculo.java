package vehiculos;

public abstract class padreVehiculo {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int año;

    public padreVehiculo(String color, String marca, String modelo, int año) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public abstract void acelerar();

    public abstract void frenar();

    public void encender() {
        System.out.println("El vehículo se ha encendido.");
    }

    public void detenerse() {
        System.out.println("El vehículo se ha detenido.");
    }

    public void imprimirDatos() {
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
