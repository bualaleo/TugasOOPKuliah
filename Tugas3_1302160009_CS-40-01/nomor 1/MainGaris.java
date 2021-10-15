public class MainGaris{
	public static void main(String[] args) {
		Titik Ta= new Titik(5,-10);
		Titik Tb= new Titik(9,11);
		System.out.println();
		Ta.printInfo();
		System.out.println();
		Tb.printInfo();
		
		Garis g = new Garis (Ta,Tb);
		System.out.println();
		g.printInfo();
		g.translasi(5,5);
		System.out.println();
		System.out.println("Panjang : "+g.hitungPanjang());
		System.out.println("Gradien : "+g.hitungGradien());
		System.out.println("Titik Tengah : "+g.cariTitikTengah());
		
		g.rotasi(30);
		g.dilatasi(4);
		g.mirrorSBX();
		g.mirrorSBY();
		System.out.println();
		System.out.println("Intersect X : "+g.intersectSBX());
		System.out.println("Intersect Y : "+g.intersectSBY());
	}
}