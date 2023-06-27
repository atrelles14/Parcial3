package vehiculos.menus;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        menuPrincipal menuPrincipal = new menuPrincipal(scanner);
        menuPrincipal.mostrarMenu();

        scanner.close();
    }
}

