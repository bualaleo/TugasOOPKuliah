public class Driver{
	public static void main(String[] args){
		Prodi pro = new Prodi();
		pro.setNamaProdi("Ilmu Peternakan");
		Mahasiswa m1 = new Mahasiswa (1302169898, "Marudut",true, "Bandung");
		Mahasiswa m2 = new Mahasiswa (1302163431, "Gery",true, "Medan");
		Mahasiswa m3 = new Mahasiswa (1302165674, "Dedy", true, "Padang");
		
		Dosen d1 = new Dosen ("David", 7491028);
		Dosen d2 = new Dosen ("Wahyu", 1979721);
	
		pro.addMahasiswa(m1);
		pro.addMahasiswa(m2);
		pro.addMahasiswa(m3);
		pro.printArrMhs();
		pro.addDosen(d1);
		pro.addDosen(d2);
		pro.printArrDosen();
	}
}
		
		
		
		
		
		
		