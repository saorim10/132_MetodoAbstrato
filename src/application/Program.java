package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import utilities.Circle;
import utilities.Rectangle;
import utilities.Shape;
import utilities.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Entre com o número de formas: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados da " + i + "ª forma: ");
			System.out.print("Retângulo ou Círculo (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Cor (Preto/Azul/Vermelho)? ");
			Color cor = Color.valueOf(sc.next());
			
			if(resp == 'r') {
				System.out.print("Largura: ");
				double larg = sc.nextDouble();
				System.out.print("Altura: ");
				double alt = sc.nextDouble();
				list.add(new Rectangle(cor, larg, alt));
			}
			
			if(resp == 'c') {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circle(cor, raio));
			}
		}
		System.out.println();
		System.out.println("Áreas das formas: ");
		
		for(Shape s: list) {
			System.out.printf("%.2f \n", s.area());
		}
		
		sc.close();

	}

}
