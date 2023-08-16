package metodos_y_arrays;
import javax.swing.*;

public class ejercicio01 {

	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog("Ingrese la figura (circulo, cuadrado o triangulo):");

        if (figura.equals("circulo")) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
            double area = calcularAreaCirculo(radio);
            JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
        } else if (figura.equals("cuadrado")) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
            double area = calcularAreaCuadrado(lado);
            JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + area);
        } else if (figura.equals("triangulo")) {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
            double area = calcularAreaTriangulo(base, altura);
            JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
        } else {
            JOptionPane.showMessageDialog(null, "Figura no reconocida.");
        }
	}
	
	String figura = JOptionPane.showInputDialog("Ingrese la figura (circulo, cuadrado o triangulo):");

	   public static double calcularAreaCirculo(double radio) {
	        return Math.PI * radio * radio;
	    }

	    public static double calcularAreaCuadrado(double lado) {
	        return lado * lado;
	    }

	    public static double calcularAreaTriangulo(double base, double altura) {
	        return 0.5 * base * altura;
	    }

}
