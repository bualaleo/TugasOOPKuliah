public class Driver {
    public static void main(String[] args) {
		System.out.println("===========================================================");
		System.out.println("\t\tDATA MAHASISWA , ASISTEN,& DOSEN");
		System.out.println("===========================================================");
        Mahasiswa s = new Mahasiswa("1302160009",3.37,"Buala Leonardo Hulu","Jl. Sukabirus Gg. Demang, Bandung, Jawa Barat");
        Asisten f = new Asisten(3.8,8,"Andika","Jl. Sukabirus Gg. Demang, Bandung, Jawa Barat");
        Dosen d = new Dosen("17233549",48,"Tompul","Jl. Sukabirus Gg. Demang, Bandung, Jawa Barat");
		System.out.println("========================MAHASISWA==========================");
        s.printInfo();
        System.out.println("===========================================================");
		System.out.println("==========================ASISTEN==========================");
        f.printInfo();
        System.out.println("===========================================================");
		System.out.println("===========================DOSEN===========================");
        d.printInfo();
        System.out.println("===========================================================");
    }
}
