package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		
		Product product = new Product();		
		
		
		System.out.println("Enter product data: ");		
		System.out.print("Name: ");
		String name = sc.nextLine();
		product.setName(name);
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		product.setPrice(price);
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		product.setQuantity(quantity);
		
		
		
		System.out.println();
		System.out.println("================UPDATE================");
		System.out.println("Product data: " + product);
		
		
		System.out.println();
		System.out.println("================UPDATE================");
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		
		System.out.println();
		System.out.println("================UPDATE================");
		System.out.println("Updated data: " + product);
		
		
		System.out.println();
		System.out.println("================UPDATE================");
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		
		System.out.println();
		System.out.println("================UPDATE FINISH================");
		System.out.println("Updated data: " + product);
		sc.close();
	}
}
