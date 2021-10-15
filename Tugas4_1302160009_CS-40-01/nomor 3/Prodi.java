class Prodi {
	private String nama;
	private Kelas[] arrKelas = new Kelas[10];
	private int jmlKelas;
	public Prodi() {

	}
	public Prodi(String kode) {
		nama = kode;
		//this.jmlKelas = jmlKelas;
	}
	public int getJmlKelas() {
		return jmlKelas;
	}
	public Kelas[] getArrKelas() {
		return arrKelas;
	}
	public String getNamaProdi() {
		return nama;
	}
	public void setJmlKelas(int jmlKelas) {
		this.jmlKelas = jmlKelas;
	}
	public void setArrKelas(Kelas[] arrKelas) {
		this.arrKelas = arrKelas;
	}
	public void setNamaProdi(String nama) {
		this.nama = nama;
	}
	public void printAttribute() {
		System.out.println("+++++++++++++++ PRODI +++++++++++++++ \n" + getNamaProdi());
		System.out.println("Total Kelas: " + getJmlKelas() + "\n");
		printArrayKelas();
		System.out.println("Rata-rata Beasiswa: " + hitungAverageIpk());
		System.out.println("Total Beasiswa: " + hitungTotalBea());
		System.out.println("Total Beasiswa Cair: " + hitungTotalBeaCair());


	}
	public void printArrayKelas() {
		for (int i=0;i<jmlKelas;i++) {
			System.out.println("======*** Kelas ke-" + (i+1) +  " ***======\n");
			arrKelas[i].printAttribute();
		}
	}
	public void addArrayKelas(Kelas k) {
		arrKelas[jmlKelas] = k;
		jmlKelas += 1;
	}
	public float hitungAverageIpk() {
		float sum=0;
		for (int i=0;i<jmlKelas;i++) {
			sum += arrKelas[i].hitungAverageIpk();
		}
		return sum/jmlKelas;
	}
	public double hitungTotalBea() {	
		float sum=0;
		for (int i=0;i<jmlKelas ;i++) {
			sum +=  arrKelas[i].hitungTotalBea();
		}
		return sum;
	}
	public double hitungTotalBeaCair() {
		float sum=0;
		for (int i=0;i<jmlKelas ;i++) {
			sum +=  arrKelas[i].hitungTotalBea();
		}
		return sum;
	}
}