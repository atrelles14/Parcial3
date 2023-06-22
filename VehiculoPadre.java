public abstract class Vehiculo {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String color, String marca, String modelo, int año) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected int getAño() {
        return año;
    }

    protected void setAño(int año) {
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

public enum TipoVehiculo {
    COCHE,
    MOTOCICLETA,
    CAMION,
    LANCHA,
    CRUCERO
}
