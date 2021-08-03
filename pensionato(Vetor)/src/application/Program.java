package application;

import java.util.Scanner;

import entities.estudante;

public class Program {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Quantos alunos alugaram? ");
		
		estudante[] quarto = new estudante[1];
		for (int i = 0; i < 1; i++) {
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("room: ");
			int room = sc.nextInt();
			if (quarto[room] == null) {
				quarto[room] = new estudante(name, email, room);
			} else {
				System.out.println("Quarto ocupado!");
			}
			for (int j = 0; j < 1; j++) {
				if (quarto[j] != null) {
					System.out.println("Rent: " + 1);
					System.out.println("Name: " + quarto[j].getNome());
					System.out.println("Email:" + quarto[j].getEmail());
					System.out.println("Room: " + quarto[j].getRoom());
				}

			}

		}

		sc.close();
	}

}
