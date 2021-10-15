public class Dosen{
	private String nama;
	private int nip;
	public Dosen(){
	
	}
	public Dosen(String name,int nip){
		this.nip = nip;
		nama = name;
	}
	public String getNama(){
		return nama;
	}
	public int getNip(){
		return nip;
	}
	public void setNama(String name){
		nama = name;
	}
	public void setNip(int nip){
		this.nip = nip;
	}
	public void printInfo(){
		System.out.println("Nama : " +getNama());
		System.out.println("Nip : " +getNip());	
	}
}
