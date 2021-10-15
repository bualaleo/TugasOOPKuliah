class Akun0009{
	private int no_akun;
	private String nama;
	public Akun0009(){no_akun=0; nama=" ";}
	public void setNoAkun(int no) {no_akun = no;}
	public void setNama(String nama){this.nama = nama;}
	public int getNo(){return no_akun;}
	public String getNama(){return nama;}
	public void info(){
	System.out.println("no akun= "+no_akun);
	System.out.println("nama= "+nama);
 }
}