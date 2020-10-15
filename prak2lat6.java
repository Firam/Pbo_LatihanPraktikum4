public class prak2lat6{
	public static void main (String [] args) {
		char hurufAwal= 'a' ;
		System.out.print ("Masukkan huruf awal nama anda = ");
		try{
			hurufAwal = (char)System.in.read();
		}catch (Exception e) {
			System.out.println("Anda salah menginput");
		}
		switch (hurufAwal){
			case (char)-1 : System.out.println("bukan huruf depan"); break;
			case 'a' : System.out.println("apa nama anda amin?"); break; 
			case 'b' : System.out.println("apa nama anda bambang?"); break; 
			case 'c' : System.out.println("apa nama anda ceceo?"); break; 
			case 'd' : System.out.println("apa nama anda daud?"); break; 
			case 'e' : System.out.println("apa nama anda endang?"); break; 
			default :  System.out.println("Saya tidak bisa menebak"); break; 
		}
	}
}