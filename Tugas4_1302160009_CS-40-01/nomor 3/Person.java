class Person{
	private String nama;
	public Person(){
	}
	public Person(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void setNama(String nama){
		this.nama=nama;
	}
	public void printAttribute(){
		System.out.println("Nama: " + getNama());
	}
}