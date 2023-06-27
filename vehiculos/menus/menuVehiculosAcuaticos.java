package vehiculos.menus;

import java.util.Scanner;
import vehiculos.padreVehiculo;
import vehiculos.acuaticos.Lancha;
import vehiculos.acuaticos.Bote_Vela;
import vehiculos.acuaticos.Crucero;

public class menuVehiculosAcuaticos {
    private Scanner scanner;
    private boolean seleccionarOtroVehiculo;

    public menuVehiculosAcuaticos(Scanner scanner) {
        this.scanner = scanner;
        seleccionarOtroVehiculo = true;
    }

    public void mostrarMenu() {
        while (seleccionarOtroVehiculo) {
            System.out.println("Ingrese el tipo de vehículo acuático deseado:");
            for (vehiculos.acuaticos.tiposVehiculos tipo : vehiculos.acuaticos.tiposVehiculos.values()) {
                System.out.println(tipo.name());
            }
            System.out.println("M. Volver al menú principal");
            System.out.print("Ingresar Aqui ---> ");
            String opcionSeleccionada = scanner.nextLine();

            if (opcionSeleccionada.equalsIgnoreCase("M")) {
                seleccionarOtroVehiculo = true;
                break; // Salir del bucle cuando se selecciona "M"
            }

            try {
                vehiculos.acuaticos.tiposVehiculos opcion = vehiculos.acuaticos.tiposVehiculos.valueOf(opcionSeleccionada.toUpperCase());
                switch (opcion) {
                    case LANCHA:
                        padreVehiculo lancha = new Lancha("Blanco", "Sea Ray", "SPX 210", 2023, null);
                        interactuarVehiculo(lancha);
                        break;
                    case CRUCERO:
                        padreVehiculo crucero = new Crucero("Blanco", "Royal Caribbean", "Symphony of the Seas", 2016, "REG002");
                        interactuarVehiculo(crucero);
                        break;
                    case BOTE_VELA:
                        padreVehiculo boteVela = new Bote_Vela("Verde", "Hobie", "Catamarán", 2022, "REG003");
                        interactuarVehiculo(boteVela);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        continue;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                continue;
            }

            System.out.println("¿Desea seleccionar otro vehículo acuático? (Si/NO) o (M para volver al menú principal)");
            String seleccion = scanner.nextLine();
            if (!seleccion.equalsIgnoreCase("SI") && !seleccion.equalsIgnoreCase("1")) {
                if (seleccion.equalsIgnoreCase("M")) {
                    seleccionarOtroVehiculo = true;
                    break; // Salir del bucle cuando se selecciona "M"
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
