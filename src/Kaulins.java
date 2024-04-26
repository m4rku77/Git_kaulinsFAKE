import java.util.Scanner;
import java.util.Random;

public class Kaulins {
	
	static void mestKaulinu(int reizes) {
		Random rand = new Random();
		
		for(int i = 0; i < reizes; i++) {
			int skaitlis = rand.nextInt(6) + 1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
		}
	}
	
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
	}
}
