import java.util.Scanner;
public class prak2lat2 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int nilai;
		
		System.out.print("Masukkan nilai =");
		nilai = input.nextInt();
		
		if (nilai ==1 ) {
			System.out.println("angka yang dimasukkan adalah satu");
		}
		else 
			System.out.println("angka yang dimasukkan bukan satu");
	}
}