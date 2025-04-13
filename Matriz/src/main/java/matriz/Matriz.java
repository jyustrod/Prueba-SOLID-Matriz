package matriz;

public class Matriz {
    private int[][] datos;

    public Matriz(int[][] datos) {
        if (datos == null) {
            throw new IllegalArgumentException("Los datos no pueden ser nulos");
        }

        this.datos = new int[datos.length][];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == null) {
                throw new IllegalArgumentException("Las filas de la matriz no pueden ser nulas");
            }
            this.datos[i] = new int[datos[i].length];
            System.arraycopy(datos[i], 0, this.datos[i], 0, datos[i].length);
        }
    }

    public void imprimir() {
        for (int[] fila : datos) {
            for (int i = 0; i < fila.length; i++) {
                System.out.print(fila[i]);
                if (i < fila.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public Matriz transpuesta() {
        if (datos.length == 0) {
            return new Matriz(new int[0][0]);
        }

        int filas = datos[0].length;
        int columnas = datos.length;

        int[][] matrizTranspuesta = new int[filas][columnas];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                matrizTranspuesta[j][i] = datos[i][j];
            }
        }

        return new Matriz(matrizTranspuesta);
    }
}
