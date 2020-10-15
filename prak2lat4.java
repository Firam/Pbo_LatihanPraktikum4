import java.util.Scanner;
public class prak2lat4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int max, min, j,z,n;
		System.out.print("Masukkan jumlah bilangan=");
		j = input.nextInt();
		min = j;
		max = j;
		for (z=1; z<=j; z++);
		{
			System.out.print("Masukkan bilangan ke-" +z+ " = ");
			n = input.nextInt();	
	
			if(n >= max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		
		System.out.println("Nilai max = " +max);
		System.out.println("Nilai min = " +min);
		}
	}