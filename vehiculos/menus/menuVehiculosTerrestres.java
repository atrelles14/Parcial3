package vehiculos.menus;

import java.util.Scanner;
import vehiculos.padreVehiculo;
import vehiculos.terrestres.Coche;
import vehiculos.terrestres.Motocicleta;
import vehiculos.terrestres.Camion;

public class menuVehiculosTerrestres {
    private Scanner scanner;
    private boolean seleccionarOtroVehiculo;

    public menuVehiculosTerrestres(Scanner scanner) {
        this.scanner = scanner;
        seleccionarOtroVehiculo = true;
    }

    public void mostrarMenu() {
        while (seleccionarOtroVehiculo) {
            System.out.println("Ingrese el tipo de vehículo terrestre deseado:");
            for (vehiculos.terrestres.tiposVehiculos tipo : vehiculos.terrestres.tiposVehiculos.values()) {
                System.out.println(tipo.name());
            }
            System.out.println("M. Volver al menú principal");
            System.out.print("Ingresar Aqui ---> ");
            String opcionSeleccionada = scanner.nextLine();

            if (opcionSeleccionada.equalsIgnoreCase("M")) {
                seleccionarOtroVehiculo = true;
                break;
            }

            try {
                vehiculos.terrestres.tiposVehiculos opcion = vehiculos.terrestres.tiposVehiculos.valueOf(opcionSeleccionada.toUpperCase());
                switch (opcion) {
                    case COCHE:
                        padreVehiculo coche = new Coche("Rojo", "Ford", "Mustang", 2022, "ABC123");
                        interactuarVehiculo(coche);
                        break;
                    case MOTOCICLETA:
                        padreVehiculo motocicleta = new Motocicleta("Negro", "Honda", "CBR600", 2021, "XYZ789");
                        interactuarVehiculo(motocicleta);
                        break;
                    case CAMION:
                        padreVehiculo camion = new Camion("Azul", "Volvo", "FH16", 2020, "DEF456");
                        interactuarVehiculo(camion);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        continue;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                continue;
            }

            System.out.println("¿Desea seleccionar otro vehículo terrestre? (Si/NO) o (M para volver al menú principal)");
            String seleccion = scanner.nextLine();
            if (!seleccion.equalsIgnoreCase("SI") && !seleccion.equalsIgnoreCase("1")) {
                if (seleccion.equalsIgnoreCase("M")) {
                    seleccionarOtroVehiculo = true;
                } else {
                    seleccionarOtroVehiculo = false;
                    break;
                }
            }
        }
    }

    private void interactuarVehiculo(padreVehiculo vehiculo) {
        vehiculo.imprimirDatos();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vehiculo.encender();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vehiculo.acelerar();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vehiculo.frenar();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vehiculo.detenerse();
    }

    public boolean isSeleccionarOtroVehiculo() {
        return seleccionarOtroVehiculo;
    }
}
