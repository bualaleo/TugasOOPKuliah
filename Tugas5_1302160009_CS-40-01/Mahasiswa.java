public class Mahasiswa extends Person implements InterfaceMahasiswa{
    private String NIM;
    private double IPK;

    public Mahasiswa() {
    }
    public Mahasiswa(String NIM, double IPK, String nama, String alamat) {
        super(nama, alamat);
        this.NIM = NIM;
        this.IPK = IPK;
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public double getIPK() {
        return IPK;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    public double hitungBeasiswa() {
	if(( IPK > 3.0 )&&(IPK <= 4.0)) {
		return 2500000;
	}
	else if (( IPK >= 3.0 )&&(IPK < 2.7)) {
		return 2000000;
	}
	else if (( IPK >= 2.7 )&&(IPK < 3.0)) {
		return 1500000;
        }else {
            return 0;
        }
    }
	public void printInfo() {
        System.out.println("Nama		: "+getNama());
        System.out.println("Alamat		: "+getAlamat());   
        System.out.println("NIM		: "+getNIM());
        System.out.println("IPK		: "+getIPK());
        System.out.println("Beasiswa	: "+hitungBeasiswa());      
    }
}
    