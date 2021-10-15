public class Driver
{
	public static void main(String args[])
	{
		
		System.out.println("DAFTAR MAHASISWA");
		Mahasiswa f1=new Mahasiswa("Buala Leonardo Hulu", 1302160009);
		Mahasiswa f2=new Mahasiswa("Gery", 1302164555);
		Mahasiswa f3=new Mahasiswa("Hovely", 1302169999);
		Mahasiswa f4=new Mahasiswa("Basado", 1302146578);
		Mahasiswa f5=new Mahasiswa("Pino", 1302160843);
		Mahasiswa f6=new Mahasiswa("Jery", 1302150889);
		f1.printInfo();
		f2.printInfo();
		f3.printInfo();
		f4.printInfo();
		f5.printInfo();
		f6.printInfo();
		System.out.println(" ");
		
		System.out.println("DAFTAR MAHASISWA S1");
		MahasiswaS1 d1=new MahasiswaS1("Buala Leonardo Hulu",1302160009,"Ilmu Komputasi");
		MahasiswaS1 d2=new MahasiswaS1("Gery",1302164555,"Informatika");
		d1.printInfo();
		d2.printInfo();
		System.out.println(" ");
		
		System.out.println("DAFTAR MAHASISWA S2");
		MahasiswaS2 s1=new MahasiswaS2("Hovely", 1302169999,"Informatika","Matematika");
		MahasiswaS2 s2=new MahasiswaS2("Basado", 1302146578,"Informatika","Matematika");
		s1.printInfo();
		s2.printInfo();
		System.out.println(" ");
		
		System.out.println("DAFTAR MAHASISWA S3");
		MahasiswaS3 a1=new MahasiswaS3("Pino", 1302160843, "Pendidikan Matematika","Matematika","Matematika");
		MahasiswaS3 a2=new MahasiswaS3("Jery", 1302150889, "Ilmu Komputasi","Matematika","Matematika");
		a1.printInfo();
		a2.printInfo();
	}
}
