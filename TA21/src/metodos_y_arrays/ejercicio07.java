package metodos_y_arrays;
import javax.swing.JOptionPane;

public class ejercicio07 {

	public static void main(String[] args) {
		String cantidadEurosInput = JOptionPane.showInputDialog("Ingrese la cantidad de euros:");
        double cantidadEuros = Double.parseDouble(cantidadEurosInput);

        String monedaDestino = JOptionPane.showInputDialog("Ingrese la moneda a la que desea convertir (dolares, yenes o libras):");

        convertirMoneda(cantidadEuros, monedaDestino);
    }

    public static void convertirMoneda(double cantidadEuros, String monedaDestino) {
        double tasaConversion;

        switch (monedaDestino.toLowerCase()) {
            case "dolares":
                tasaConversion = 1.28611; 
                break;
            case "yenes":
                tasaConversion = 129.852; 
                break;
            case "libras":
                tasaConversion = 0.86; 
                break;
            default:
                JOptionPane.showMessageDialog(null, "Moneda no válida.");
                return;
        }

        double cantidadConvertida = cantidadEuros * tasaConversion;
        JOptionPane.showMessageDialog(null, cantidadEuros + " euros son equivalentes a " + cantidadConvertida + " " + monedaDestino + ".");

	}

}