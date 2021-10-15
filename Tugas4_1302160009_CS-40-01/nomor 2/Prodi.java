public class Prodi{
	private String namaProdi;
	private int jmlMahasiswa;
	private int jmlDosen;
	private String ketuaKelas;
	private Mahasiswa[] arrayMhs = new Mahasiswa[15];
	private Dosen[] arrayDosen = new Dosen[12];
	public Prodi(){
		
	}
	public Prodi(String kode){
		kode = namaProdi;	
	}
	public String getNamaProdi(){
		return namaProdi;
	}
	public int getJmlMahasiswa(){
		return jmlMahasiswa;
	}
	public int getJmlDosen(){
		return jmlDosen;
	}
	public String getketuaKelas(){
		return ketuaKelas;
	}
	private Mahasiswa[] getArrayMhs(){
		return arrayMhs;
	}
	private Dosen[] getArrayDosen(){
		return arrayDosen;
	}
	public void setNamaProdi(String kode){
		kode = namaProdi;
	}
	private void setJmlMahasiswa(int jmlMahasiswa){
		this.jmlMahasiswa = jmlMahasiswa;
	}
	private void setJmlDosen(int jmlDosen){
		this.jmlDosen = jmlDosen;
	}
	private void setKetuaKelas(String ketuaKelas){
		this.ketuaKelas = ketuaKelas;
	}
	public void addMahasiswa(Mahasiswa m){
		arrayMhs[jmlMahasiswa] = m;
		jmlMahasiswa += 1;
	}
	public void printArrMhs(){
		for(int i=0;i<getJmlMahasiswa();i++){
			arrayMhs[i].printInfo();
		}
	}
	public void addDosen(Dosen d){
		arrayDosen[jmlDosen] = d;
	    jmlDosen += 1;
	}
	public void printArrDosen(){
		for(int i=0;i<getJmlDosen();i++){
			arrayDosen[i].printInfo();
		}
	}
}

		
	
	