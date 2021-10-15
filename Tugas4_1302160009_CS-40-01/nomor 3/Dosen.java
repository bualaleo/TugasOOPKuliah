class Dosen extends Person{
	private String nip;
	private String nama;
	public Dosen() {
		
	}
	public Dosen(String nip, String nama) {
		super(nama);
		this.nip = nip;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip=nip;
	}
	public void printAttribute() {
		super.printAttribute();
		//System.out.println("Nama: " + super.getNama());
		System.out.println("Nip: " + getNip() + "\n");
		//
	}	
}