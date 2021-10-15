public class Mahasiswa{
	private String nama;
	private int nim;
	public Mahasiswa(){
	}
	public Mahasiswa(String nama, int nim){
		this.nama=nama;
		this.nim=nim;
	}
	public int getNimMahasiswa(){
		return this.nim;
	}
	public String getNamaMahasiswa(){
		return this.nama;
	}
	public void setNimMahasiswa(int n){
		this.nim=n;
	}
	public void setNamaMahasiswa(String a){
		this.nama=a;
	}
	public void printInfo(){
		System.out.println("\nNama : "+this.nama);
		System.out.println("Nim  : "+this.nim);
	}
}
