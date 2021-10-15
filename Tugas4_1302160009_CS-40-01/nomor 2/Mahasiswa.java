public class Mahasiswa{
	private int nim;
	private String nama;
	private boolean gender;
	private String alamat;
	public Mahasiswa(){
		
	}
	public Mahasiswa(int nim, String name, boolean gender, String alamat){
		this.nim = nim;
		nama = name;
		this.gender = gender;
		this.alamat = alamat;
	}
	public int getNim(){
		return nim;
	}
	public String getNama(){
		return nama;
	}
	public boolean getGender(){
		return gender;
	}
	public String getAlamat(){
		return alamat;
	}
	public void setNim(int nim){
		this.nim = nim;
	}
	public void setNama(String name){
		nama = name ;
	}
	public void setGender(boolean gender){
		this.gender = gender;
	}
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	public void printInfo(){
		System.out.println("Nim : " +getNim());
		System.out.println("Nama : " +getNama());
		System.out.println("Gender : " +getGender());
			if(gender == true){
				System.out.println(" Gender : Laki-Laki ");
			}else{
				System.out.println(" Gender : Perempuan ");
			}
		System.out.println("Alamat : " +getAlamat());
		System.out.print("\n");
	}
}
	
		
		
