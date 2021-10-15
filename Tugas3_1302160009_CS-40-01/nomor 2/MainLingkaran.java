public class MainLingkaran{
	public static void main(String[] args) {
	Titik T= new Titik(7,-7);
	System.out.println();
	T.printInfo();
	T.setX(14);
	T.setY(-14);
	
	Lingkaran L = new Lingkaran(7,T);
	L.getCenter().printInfo();
	System.out.println();
	L.getCenter().translasi(5,5);
	System.out.println("Luas Lingkaran : "+L.luasLingkaran());
	System.out.println("Kelling Lingkaran : "+L.getLuasLingkaran());
	System.out.println("Cek Titik Inter : "+L.cekTitikInner(T.getX(),T.getX()));
	L.getCenter().mirrorSbX();
	L.getCenter().mirrorSbY();
	}
}