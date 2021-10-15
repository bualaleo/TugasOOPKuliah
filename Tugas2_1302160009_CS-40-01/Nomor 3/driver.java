class driver{
	public static void main(String args[]){
		Titik t = new Titik(3,5);
		System.out.println(" ");
		System.out.println("Titik");
		t.printInfo();
		System.out.println("Jarak Origin = " +t.hitungJarakOrigin());
		System.out.println("Kuadran = " +t.hitungKuadran());
		t.Translasi(2,3);
		t.rotasi(90);
		t.dilatasi(2);
		t.mirrorSbX();
		t.mirrorSbY();
		System.out.println(" ");
		
		
		Titik3D ti = new Titik3D(3,5,-5);
		System.out.println(" ");
		System.out.println("Titik 3D");
		ti.printInfo();
		System.out.println("Jarak Origin dgn titik (x,y,z) = " + ti.hitungJarakOrigin());
		System.out.println("Merupakan kuadran ke = " + ti.hitungKuadran());
		ti.translasi(2,3,5);
		ti.mirrorSbX();
		ti.mirrorSbY();
		ti.mirrorSbZ();
	}
}
		