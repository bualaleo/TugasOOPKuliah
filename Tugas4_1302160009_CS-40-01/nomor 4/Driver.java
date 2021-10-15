class Driver{
	public static void main(String[] args) {
		KPP kp = new KPP();
		kp.setNama("Fams");
		Karyawan[] k = new Karyawan[3];
		Perusahaan[] p  = new Perusahaan[2];
		Karyawan k1 = new Karyawan("Andika","12345","31-065788497-14",185000,3);
		Karyawan k2 = new Karyawan("Yusuf","23456","31-75829609-18",150000,1);
		Karyawan k3 = new Karyawan("Jordan","34567","31-856979814-26",165000,1);

		Perusahaan p1 = new Perusahaan("Warung Lesehan","WRL"); //String nama, String npwp, int jmlK
		Perusahaan p2 = new Perusahaan("Rumah Makan Padang","RMP");
		
		p1.addKaryawan(k1);
		p1.addKaryawan(k1);
		p1.addKaryawan(k3);

		p2.addKaryawan(k2);
		p2.addKaryawan(k3);

		kp.addPerusahaan(p1);
		kp.addPerusahaan(p2);

		kp.viewInfo();
	}
}
