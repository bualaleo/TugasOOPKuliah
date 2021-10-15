class Kelas {
	private String kode;
	private Mahasiswa[] arrMhs = new Mahasiswa[10];
	private int jmlMhs;
	public Kelas(){

	}
	public Kelas(String kode){
		this.kode = kode;
		//this.jmlMhs = jmlMhs;
	}
	public String getKode(){
		return kode;
	}
	public Mahasiswa[] getArrMhs(){
		return arrMhs;
	}
	public int getJmlMhs(){
		return jmlMhs;
	}
	public void setKode(String kode){
		this.kode = kode;
	}
	public void setArrMhs(Mahasiswa[] arrMhs){
		this.arrMhs = arrMhs;
	}
	public void setJmlMhs(int jmlMhs){
		this.jmlMhs = jmlMhs;
	}
	public void printAttribute(){
		System.out.println("Kode Kelas: " + getKode());
		System.out.println("Jumlah Mahasiswa: " + getJmlMhs() + "\n");
		printArrayMhs();
	}
	public void printArrayMhs(){
		for (int i=0;i<jmlMhs ;i++){
			System.out.println("*** Mahasiswa " + (i+1) + " ***");
			arrMhs[i].printAttribute();
		}
	}
	public void addArrayMhs(Mahasiswa Mhs){
		arrMhs[jmlMhs] = Mhs;
		jmlMhs += 1;
	}
	public void filterMahasiswaIpk(float ipk){
		for (int i=0;i<jmlMhs ;i++) {
			if (arrMhs[i].getIpk() == ipk) {
				arrMhs[i].printAttribute();
			}
		}
	}
	public void filterMahasiswaStatus(int status){
		for (int i=0;i<jmlMhs ;i++){
			if (arrMhs[i].getStatus() == status){
				arrMhs[i].printAttribute();
			}
		}
	}
	public float hitungAverageIpk(){
		float sum=0;
		for (int i=0;i<jmlMhs ;i++){
			sum += arrMhs[i].getIpk();
		}
		return sum/jmlMhs;
	}
	public double hitungTotalBea(){
		//return getJmlMhs()*
		int sum=0;
		for (int i=0;i<jmlMhs ;i++){
			sum +=  arrMhs[i].getBpp();
		}
		return sum;
	}
	public double hitungTotalBeaCair(){
		return hitungTotalBea();
	}
}