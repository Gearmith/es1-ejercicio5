/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio5;
import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo por favor");
	double r = entrada.nextDouble();
	System.out.println("El area del circulo es: " + (Math.PI*Math.pow(r, 2)));
	System.out.println("El longitud del circulo es: " + 2*(Math.PI*r));
    }
}
