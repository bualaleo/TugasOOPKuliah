class Driver{
	public static void main(String[] args) {
		Prodi p = new Prodi();
		p.setNamaProdi("Matematika");
		Mahasiswa a1 = new Mahasiswa("David","13021754",4f,1);
		Mahasiswa a2= new Mahasiswa("Agung","13025619",3.7f,0);
		Mahasiswa a3 = new Mahasiswa("Maimunah","130205628",1f,1);
		Mahasiswa a4 = new Mahasiswa("Patrick","13028712",2.5f,1);
		Mahasiswa a5 = new Mahasiswa("Cristian","13022353",3.9f,1);

		Dosen b1 = new Dosen("ARM","Armstrong");
		Dosen b2 = new Dosen("FTH","Fathur");
		Kelas k1 = new Kelas("A302F"); 
		Kelas k2 = new Kelas("B208A");

		a1.setBpp(600000);
		a2.setBpp(5500000);
		a3.setBpp(13000000);
		a4.setBpp(1950000);
		a5.setBpp(120000);

		k1.addArrayMhs(a1);
		k1.addArrayMhs(a4);
		k1.addArrayMhs(a5);

		k2.addArrayMhs(a2);
		k2.addArrayMhs(a3);
		System.out.println("+++++++++++++++ Daftar Dosen +++++++++++++++");
		b1.printAttribute();
		b2.printAttribute();
		
		p.addArrayKelas(k1);
		p.addArrayKelas(k2);

		p.printAttribute();			
	}
}