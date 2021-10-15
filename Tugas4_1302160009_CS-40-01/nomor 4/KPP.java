class KPP {
	private String nama;
	private Perusahaan[] listPerusahaanm = new Perusahaan[10];
	private int jmlP;
	public KPP() {
		
	}
	public KPP(String nama, int jmlP) {
		this.nama= nama;
		this.jmlP = jmlP;
	}
	public String getNama() {
		return nama;
	}
	public int getJmlP() {
		return jmlP;
	}
	public Perusahaan[] getPerusahaan() {
		return listPerusahaanm;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setJmlP(int jmlP){
		this.jmlP = jmlP;
	}
	public void viewAllPerusahaan() {
		for (int i=0;i<jmlP;i++) {
			System.out.println(" Perusahaan - " + (i+1) + " ");
			listPerusahaanm[i].viewInfo();
		}
	}
	public void addPerusahaan(Perusahaan p) {
		listPerusahaanm[jmlP] = p;
		jmlP += 1;
	}
	public float hitungPajakTotal() {
		float sum=0;
		for (int i=0;i<jmlP;i++) {
			sum += listPerusahaanm[i].hitungPajakTotal();
		}
		return sum;
	}
	public void viewPajakTotal() {
		for (int i=0;i<jmlP;i++) {
			System.out.println("Pajak ke-" + (i+1) + "= " + listPerusahaanm[i].hitungPajakTotal());
		}
	}
	public void viewPajakMasuk() {
		for (int i=0;i<jmlP;i++) {
			System.out.println("Pajak Masuk Perusahaan-" + (i+1) + "= " + listPerusahaanm[i].hitungPajakTotal());		
		}
	}
	public void viewInfo() {
		System.out.println("Nama KPP: " + getNama());
		System.out.println("Jumlah Perusahaan: " + getJmlP()+"\n");
		viewAllPerusahaan();	
		viewPajakTotal();
		viewPajakMasuk();
	}
}
