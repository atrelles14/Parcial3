package vehiculos;

public class imprimir {
    public static void imprimirTabla(String[] headers, String[] data) {
        int numColumns = headers.length;
        int totalWidth = numColumns * 20 + 1;

        imprimirLinea(totalWidth);
        imprimirFila(headers);
        imprimirLinea(totalWidth);
        imprimirFila(data);
        imprimirLinea(totalWidth);
    }

    private static void imprimirLinea(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void imprimirFila(String[] values) {
        for (String value : values) {
            System.out.format("| %-18s ", value);
        }
        System.out.println("|");
    }
}