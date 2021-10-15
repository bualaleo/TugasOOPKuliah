class Karyawan {
	private String nama;
	private String nip;
	private String npwp;
	private float Gaji;
	private int status;
	public Karyawan() {

	}
	public Karyawan(String nama, String nip, String npwp, int Gaji, int status) {
		this.nama = nama;
		this.nip = nip;
		this.npwp = npwp;
		this.Gaji = Gaji;
		this.status = status;
	}
	public float hitungPajak() {
		if(getStatus()==11) {
			return getGaji()*0.05f;
		}
		else if (getStatus()==2) {
			return getGaji()*0.15f;	
		}
		else if (getStatus()==3) {
			return getGaji()*0.25f;
		}
		else if (getStatus()==4) {
			return getGaji()*0.30f;
		}
		else{
			return 0;	
		}
	}
	public String getNama() {
		return nama;
	}
	public String getNip() {
		return nip;
	}
	public String getNpwp() {
		return npwp;
	}
	public float getGaji() {
		return Gaji;
	}
	public int getStatus() {
		return status;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}
	public void setGaji(float Gaji) {
		this.Gaji = Gaji;
	}
	public void setStatus(int s) {
		status = s;
	}
	public void viewInfo() {
		System.out.println("Nama: " + getNama());
		System.out.println("NIP: " + getNip());
		System.out.println("NPWP: " + getNpwp());
		System.out.println("Gaji: Rp " + getGaji());
		System.out.println("Status: " + getStatus() + "\n");
	}
}