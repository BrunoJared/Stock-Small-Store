package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.Name = sc.nextLine();
		
		System.out.print("Description: ");
		product.Description = sc.nextLine();
		
		System.out.print("Category: ");
		product.Category = sc.nextLine();
		
		
		System.out.print("Price: ");
		product.Price = sc.nextDouble();
		
		
		
		
		
		
		System.out.print("Quantity in stock: ");
		product.Quantity = sc.nextInt();
		System.out.println();
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		
		
		
		System.out.println("Updated data: " + product);
		
		
		
		sc.close();
		

	}

	}
