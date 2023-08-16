package metodos_y_arrays;
import javax.swing.JOptionPane;

public class ejercicio08 {

	public static void main(String[] args) {
        int[] array = new int[10];

        rellenarValores(array);
        mostrarArray(array);
    }

    public static void rellenarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String valorInput = JOptionPane.showInputDialog("Ingrese un valor para la posición " + i + ":");
            
            if (!valorInput.isEmpty()) {
                int valor = Integer.parseInt(valorInput);
                array[i] = valor;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor.");
                i--; 
            }
        }
    }

    public static void mostrarArray(int[] array) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            output.append(i).append(" - ").append(array[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, "Posición - Valor:\n" + output.toString());
    }
}