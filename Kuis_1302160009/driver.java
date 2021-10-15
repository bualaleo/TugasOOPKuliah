public class driver{
	public static void main(String[]args){
		kotak0009 x=new kotak0009();
		kotak0009 y=new kotak0009(4,6,18);
		kotak0009 z;
		System.out.println("Kotak y");
		y.Info();
		System.out.println("Volume= "+y.hitungvolume());
		System.out.println("Luas permukaan= "+y.hitungluaspermukaan());
		
		System.out.println("\nKotak tumpuk");
		z=x.tumpuk(y);
		z.Info();
		System.out.println("Volume= "+z.hitungvolume());
		System.out.println("Luas Permukaan= "+z.hitungluaspermukaan());
		
		System.out.println("\nApakah lebih besar dari kotak y = "+z.lebihBesar(y));
		System.out.println("\nApakah sama dengan dari kotak y = "+z.sama(y));
		
		y.setPanjang(10);
		y.atur();
		System.out.println("\nKotak Jejer");
		z=y.jejer(x);
		z.Info();
		System.out.println("Volume= "+z.hitungvolume());
		System.out.println("Luas Permukaan= "+z.hitungluaspermukaan());
		
		System.out.println("\nApakah lebih besar dari kotak y = "+z.lebihBesar(y));
		System.out.println("\nApakah sama dengan dari kotak y = "+z.sama(y));
	
		System.out.println("\nKotak Potong");
		z=y.potong(5);
		z.Info();
		System.out.println("Volume= "+z.hitungvolume());
		System.out.println("Luas Permukaan= "+z.hitungluaspermukaan());
		
		System.out.println("\nApakah lebih besar dari kotak y = "+z.lebihBesar(y));
		System.out.println("\nApakah sama dengan dari kotak y = "+z.sama(y));		
	}
}