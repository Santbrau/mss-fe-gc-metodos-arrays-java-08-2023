package metodos_y_arrays;
import javax.swing.JOptionPane;
import java.util.Random;

public class ejercicio12 {

	public static void main(String[] args) {
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array:"));
        int[] arrayOriginal = new int[tamanoArray];

        rellenarArrayAleatorio(arrayOriginal);

        int digitoTerminacion = obtenerDigitoTerminacion();

        int[] arrayFiltrado = filtrarPorDigito(arrayOriginal, digitoTerminacion);

        System.out.println("Array Original:");
        mostrarArray(arrayOriginal);

        System.out.println("Array Filtrado (terminación en " + digitoTerminacion + "):");
        mostrarArray(arrayFiltrado);
    }

    public static void rellenarArrayAleatorio(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300) + 1; 
        }
    }

    public static int obtenerDigitoTerminacion() {
        int digito = -1;
        boolean valido = false;

        while (!valido) {
            String digitoInput = JOptionPane.showInputDialog("Ingrese el dígito de filtro (0-9):");

            try {
                digito = Integer.parseInt(digitoInput);
                if (digito >= 0 && digito <= 9) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido entre 0 y 9.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido entre 0 y 9.");
            }
        }

        return digito;
    }

    public static int[] filtrarPorDigito(int[] array, int digito) {
        int[] arrayFiltrado = new int[array.length];
        int count = 0;

        for (int num : array) {
            if (num % 10 == digito) {
                arrayFiltrado[count] = num;
                count++;
            }
        }

        int[] resultado = new int[count];
        System.arraycopy(arrayFiltrado, 0, resultado, 0, count);

        return resultado;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}
