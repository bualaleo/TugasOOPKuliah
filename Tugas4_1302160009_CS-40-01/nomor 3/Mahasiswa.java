class Mahasiswa extends Person{
	private String nim;
	private float ipk;
	private int status;
	private float bpp; 
	private int persen;
	public Mahasiswa() {
		super();
	} 
	public Mahasiswa(String nama, String nim, float ipk, int status) {
		super(nama);
		this.nim = nim;
		this.ipk = ipk;
		this.status = status;
	}
	public String getNim() {
		return nim;
	}
	public float getIpk() {
		return ipk;
	}
	public int getStatus() {
		return status;
	}
	public float getBpp() {
		return bpp;
	}
	public int getPersen() {
		return  persen;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public void setIpk(float ipk) {
		this.ipk = ipk;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setBpp(float bpp) {
		this.bpp = bpp;
	}
	public void setPersen(int persen) {
		this.persen = persen;
	}
	public void printAttribute() {
		super.printAttribute();
		//System.out.println("Nama: " + super.getNama());
		System.out.println("Nim:" + getNim());
		System.out.println("IPK: " + getIpk());
		System.out.println("Status: " + getStatus() + "(1:Aktif ; 0: NonAktif)" +"\n");
	}
	public double hitungBeasiswa(int persen) {
		if(persen == 100) {
			return 0;
		}
		else if (persen==50) {
			return 0.5*getBpp();
		}
		else if (persen==25) {
			return 0.25*getBpp();
		}
		else {
			return 1*getBpp();
		}
	}
}