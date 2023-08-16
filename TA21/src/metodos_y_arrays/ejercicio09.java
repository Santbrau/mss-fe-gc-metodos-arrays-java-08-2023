package metodos_y_arrays;
import javax.swing.JOptionPane;
import java.util.Random;

public class ejercicio09 {

	public static void main(String[] args) {
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array:"));
        int[] array = new int[tamanoArray];

        rellenarArray(array, 0, 9);
        mostrarArrayYSuma(array);
    }

    public static void rellenarArray(int[] array, int minimo, int maximo) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }
    }

    public static void mostrarArrayYSuma(int[] array) {
        int suma = 0;

        System.out.println("Posición\tValor");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "\t\t" + array[i]);
            suma += array[i];
        }

        System.out.println("Suma total: " + suma);
    }
}