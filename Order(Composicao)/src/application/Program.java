package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);
		var sdf = new SimpleDateFormat("dd/MM/yyyy");

		var client1 = new Client("Jonathan", "jhow.wi56@gmail.com", sdf.parse("08/05/2002"));


		String status = "PROCESSING";

		var order1 = new Order(new Date(), OrderStatus.valueOf(status), client1);
		System.out.println("How many items to this order: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" +i+" item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();

			var p1 = new Product(productName, price);
			var orderItem1 = new OrderItem(quantity, price, p1);

			order1.addItem(orderItem1);

		}
		
		System.out.println(order1);
		sc.close();
	}

}
