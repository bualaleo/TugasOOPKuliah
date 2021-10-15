class driver{
	public static void main(String args[]){
		lingkaran l = new lingkaran();
		System.out.println("Lingkaran");
		l.printInfo();
		System.out.println("Luas : "+l.hitungluas());
		System.out.println("Keliling : "+l.hitungkeliling());
		System.out.println(" ");
		
		bola b = new bola();
		System.out.println("Bola");
		b.printInfo();
		System.out.println("Luas permukaan : "+b.hitungluas());
		System.out.println("Volume : "+b.hitungvolume());
		System.out.println(" ");
		
		kerucut k = new kerucut();
		System.out.println("Kerucut");
		k.printInfo();
		System.out.println("Luas Permukaan : "+k.hitungluas());
		System.out.println("Volume : "+k.hitungvolume());
	}
}