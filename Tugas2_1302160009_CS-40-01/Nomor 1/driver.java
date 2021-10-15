class driver{
	public static void main(String args[]){
		System.out.println("Class Segiempat");
		segiempat se = new segiempat();
		se.printInfo();
		System.out.println("Luas : "+se.hitungluas());
		System.out.println("Keliling : "+se.hitungkeliling());
		System.out.println(" ");
		
		System.out.println("Class Balok");
		balok b = new balok();
		b.printInfo();
		System.out.println("Luas Permukaan : "+b.hitungluaspermukaan());
		System.out.println("Volume : "+b.hitungvolume());
		System.out.println(" ");
		
		System.out.println("Class Prisma");
		prisma p = new prisma();
		p.printInfo();
		System.out.println("Tinggi alas : "+p.tinggialas());
		System.out.println("Volume : "+p.hitungvolume());
		System.out.println("Luas Permukaan : "+p.hitungluaspermukaan());
		System.out.println(" ");
	}
}