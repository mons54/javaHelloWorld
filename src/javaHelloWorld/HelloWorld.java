package javaHelloWorld;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		//Un commentaire

		/*
		  Un autre commentaire
		  sur plusiers ligne
		 */
		
		System.out.print("Hello World !");
		System.out.println("\nSaut de ligne");
		
		double nb1 = 800_000.0d;
		double nb2 = 3.0d;
		double nb3;
		nb3 = nb1 / nb2;
		System.out.println(nb3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
	}
}
