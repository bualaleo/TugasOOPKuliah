public class MainSegiempat{
	public static void main(String[] args) {
	Titik TX= new Titik(5,-10);
	Titik TY= new Titik(14,-15);
	System.out.println();
	TX.printInfo();
	TX.printInfo();
	TX.setX(-14);
	TX.setY(13);
	
	Segiempat L = new Segiempat(TX,TY);
	System.out.println("Panjang :"+L.hitungPanjang());
	System.out.println("Lebar :"+L.hitungLebar());
	System.out.println("Luas :"+L.getLuasSegiempat());
	System.out.println("Keliling :"+L.getKelilingSegiempat());
	L.translasi(5,5);
	L.mirrorSbX();
	L.mirrorSbY();
	}
}