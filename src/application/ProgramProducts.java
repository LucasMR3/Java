package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProducts {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		product.setName("TV");
		System.out.println("\nUpdated name: " + product.getName());
		product.setPrice(100.00);
		System.out.println("Updated price: " + product.getPrice());
		System.out.printf("\n\nProduct data: "  + product);

		System.out.printf("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.printf("\n\nUpdated data: " + product);

		System.out.printf("\n\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.printf("\n\nUpdated data: " + product);

		sc.close();
	}
}