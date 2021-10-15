class Perusahaan{
	private Karyawan[] listKaryawan = new Karyawan[10];
	private String npwp;
	private String nama;
	private int jmlK;
	public Perusahaan() {

	}
	public Perusahaan(String nama, String npwp) {
		this.nama = nama;
		this.npwp = npwp;
	}
	public String getNpwp() {
		return npwp;
	}
	public String getNama() {
		return nama;
	}
	public int getjmlK() {
		return jmlK;
	}
	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setJmlK(int jmlK) {
		this.jmlK = jmlK;
	}
	//public void 
	public void viewAllKaryawan() {
		for (int i=0;i<jmlK ;i++ ) {
			listKaryawan[i].viewInfo();
		}
	}
	public void filterKaryawan(float pajak) {
		for (int i=0;i<jmlK ;i++ ) {
			if(listKaryawan[i].hitungPajak() >= pajak) {
				listKaryawan[i].viewInfo();	
			}
		}
	}
	public void filterKaryawan(int status) {
		for (int i=0;i<jmlK ;i++ ) {
			if(listKaryawan[i].getStatus() == status) {
				listKaryawan[i].viewInfo();	
			}
		}
	}
	public float hitungPajakTotal() {
		float sum=0;
		for (int i=0;i<jmlK ;i++) {
			sum += listKaryawan[i].hitungPajak();
		}
		return sum;
	}
	public void addKaryawan(Karyawan k) {
		listKaryawan[jmlK] = k;
		jmlK += 1; 
	}
	public void viewInfo() {
		System.out.println("Nama Perusahaan: " + getNama());
		System.out.println("NPWP: " + getNpwp());
		System.out.println("Jumlah Karyawan: " + getjmlK()+"\n");
		System.out.println("List Data Karyawan");
		viewAllKaryawan();
	}
}
