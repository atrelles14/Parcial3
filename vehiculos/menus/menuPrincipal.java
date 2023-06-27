package vehiculos.menus;

import java.util.Scanner;

public class menuPrincipal {
    private Scanner scanner;

    public menuPrincipal(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        boolean seleccionarOtroVehiculo = true;

        while (seleccionarOtroVehiculo) {
            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1. Vehículos Terrestres");
            System.out.println("2. Vehículos Acuáticos");
            System.out.println("0. Salir");
            System.out.print("Ingresar Aqui ---> ");
            int tipoVehiculo = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            if (tipoVehiculo == 0) {
                break;
            } else if (tipoVehiculo == 1) {
                menuVehiculosTerrestres menuTerrestres = new menuVehiculosTerrestres(scanner);
                menuTerrestres.mostrarMenu();
                seleccionarOtroVehiculo = menuTerrestres.isSeleccionarOtroVehiculo();
            } else if (tipoVehiculo == 2) {
                menuVehiculosAcuaticos menuAcuaticos = new menuVehiculosAcuaticos(scanner);
                menuAcuaticos.mostrarMenu();
                seleccionarOtroVehiculo = menuAcuaticos.isSeleccionarOtroVehiculo();
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

