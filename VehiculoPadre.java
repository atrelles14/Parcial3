/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial3;

import java.util.Scanner;

public class Parcial3 {
    public enum TipoVehiculo {
        COCHE,
        MOTOCICLETA,
        CAMION,
        LANCHA,
        CRUCERO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un tipo de vehículo:");
        System.out.println("1. Coche");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camión");
        System.out.println("4. Lancha");
        System.out.println("5. Crucero");

        int opcion = scanner.nextInt();
        scanner.close();

        TipoVehiculo tipo = null;

        switch (opcion) {
            case 1:
                tipo = TipoVehiculo.COCHE;
                break;
            case 2:
                tipo = TipoVehiculo.MOTOCICLETA;
                break;
            case 3:
                tipo = TipoVehiculo.CAMION;
                break;
            case 4:
                tipo = TipoVehiculo.LANCHA;
                break;
            case 5:
                tipo = TipoVehiculo.CRUCERO;
                break;
            default:
                System.out.println("Opción inválida. Seleccionando Coche por defecto.");
                tipo = TipoVehiculo.COCHE;
                break;
        }

        Vehiculo vehiculo;

        switch (tipo) {
            case COCHE:
                vehiculo = new Coche("Rojo", "Ford", "Mustang", 2022);
                break;
            case MOTOCICLETA:
                vehiculo = new Motocicleta("Negro", "Honda", "CBR600", 2021);
                break;
            case CAMION:
                vehiculo = new Camion("Azul", "Volvo", "FH16", 2020);
                break;
            case LANCHA:
                vehiculo = new Lancha("Blanco", "Sea Ray", "SPX 210", 2023);
                break;
            case CRUCERO:
                vehiculo = new Crucero("Blanco", "Royal Caribbean", "Symphony of the Seas", 2018);
                break;
            default:
                vehiculo = new Coche("Rojo", "Ford", "Mustang", 2022);
                break;
        }

        vehiculo.imprimirDatos();
        vehiculo.encender();
        vehiculo.acelerar();
        vehiculo.frenar();
        vehiculo.detenerse();
    }



abstract class Vehiculo {
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
}


