package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		var sc = new Scanner(System.in);
		var sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		var c1 = new Comment("Have a nice trip!");
		var c2 = new Comment("wow that's awesome!");
		
		var p1 = new Post(sdf.parse("08/05/2002 17:50:59"),
				"Traveling to New Zealand",
				"I´m going to visit this wonderfull country!", 
				50);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
		
sc.close();
	}

}
