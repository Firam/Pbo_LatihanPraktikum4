import java.util.Scanner;
public class prak2lat5 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int nilai;
		
		System.out.println("Masukkan nilai=");
		nilai= input.nextInt();
		
		if (nilai > 0)
		System.out.println ("Nilai berniai positif");
		else
		System.out.println("Nilai bernilai negatif");
	}
	}
