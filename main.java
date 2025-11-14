package aplication;
import java.util.Scanner;
import entities.Triangulo;
public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Triangulo x,b;
		x = new Triangulo();
		b = new Triangulo();
		System.out.println("Digite aqui as medidas  de cada lado do triangulo A ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Digite aqui as medidas  de cada lado do triangulo B ");
		b.a = scan.nextDouble();
		b.b = scan.nextDouble();
		b.c = scan.nextDouble();
		double areax = x.area();
		double areab = b.area();
		if (areax > areab) {
			System.out.println("o Triangulo X é maior");
		}else {
			System.out.println("o Triangulo B é maior");
		}
	}

}
