package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.enums.Color;
import entities.Retangulo;
import entities.Circulo;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter como o numero de forma: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Forma #" + i + " data: ");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (Preto/Azul/Vermelha): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(color, altura, largura));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circulo(color, radius));
			}
		}

		System.out.println();
		System.out.println("Formas Areas: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();

	}

}
