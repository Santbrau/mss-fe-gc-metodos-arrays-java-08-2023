package metodos_y_arrays;
import javax.swing.JOptionPane;

public class ejercicio05 {

	public static void main(String[] args) {
		String numeroInput = JOptionPane.showInputDialog("Ingrese un número entero en base decimal:");
        int numeroDecimal = Integer.parseInt(numeroInput);

        String numeroBinario = convertirDecimalABinario(numeroDecimal);

        JOptionPane.showMessageDialog(null, "El número " + numeroDecimal + " en base binaria es: " + numeroBinario);
    }

    public static String convertirDecimalABinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            binario.insert(0, residuo);
            numeroDecimal /= 2;
        }

        return binario.toString();

	}

}
