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

class Coche extends Vehiculo {
    public Coche(String color, String marca, String modelo, int año) {
        super(color, marca, modelo, año);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche está frenando.");
    }
}

class Motocicleta extends Vehiculo {
    public Motocicleta(String color, String marca, String modelo, int año) {
        super(color, marca, modelo, año);
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La motocicleta está frenando.");
    }
}

class Camion extends Vehiculo {
    public Camion(String color, String marca, String modelo, int año) {
        super(color, marca, modelo, año);
    }

    @Override
    public void acelerar() {
        System.out.println("El camión está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El camión está frenando.");
    }
}

class Lancha extends Vehiculo {
    public Lancha(String color, String marca, String modelo, int año) {
        super(color, marca, modelo, año);
    }

    @Override
    public void acelerar() {
        System.out.println("La lancha está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La lancha está frenando.");
    }
}

class Crucero extends Vehiculo {
    public Crucero(String color, String marca, String modelo, int año) {
        super(color, marca, modelo, año);
    }

    @Override
    public void acelerar() {
        System.out.println("El crucero está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El crucero está frenando.");
    }
}

public enum TipoVehiculo {
    COCHE,
    MOTOCICLETA,
    CAMION,
    LANCHA,
    CRUCERO
}
