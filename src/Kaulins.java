import java.util.Random;
import java.util.Scanner;

public class Kaulins {
<<<<<<< HEAD

	public static void main(String[] args) {
		int skaitlis, reizes;
=======
	
	static void mestKaulinu() {
		int skaitlis;
>>>>>>> idejuZars
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		
		for(int i=0; i<reizes; i++) {
		skaitlis = rand.nextInt(6)+1;
<<<<<<< HEAD
		System.out.println("Uzkrita skaitlis: "+skaitlis);
=======
		System.out.print("Uzkrita skaitlis: "+skaitlis);
	}

	public static void main(String[] args) {
		mestKaulinu();
>>>>>>> idejuZars

	}
		scan.close();
}
}
