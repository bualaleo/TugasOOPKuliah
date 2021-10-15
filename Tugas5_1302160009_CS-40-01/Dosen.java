public class Dosen extends Person implements InterfaceDosen{
    private String NIP;
    private int TotalJam;

    public Dosen() {
    }
    public Dosen(String NIP, int TotalJam, String nama, String alamat) {
        super(nama, alamat);
        this.NIP = NIP;
        this.TotalJam = TotalJam;
    }
    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public int getTotalJam() {
        return TotalJam;
    }
    public void setTotalJam(int TotalJam) {
        this.TotalJam = TotalJam;
    }
    public double hitungGaji() {
        return TotalJam * honor;
    }
    public double hitungPajak(){
        double Gaji = hitungGaji();
        if(Gaji >= 2000000){
            return Gaji * 0.25;
        }
        else if((Gaji < 2000000)&&( Gaji > 100000)){
            return Gaji * 0.15;
        }else{
            return Gaji * 0.05;
        }
    }
    public double hitungTotalTerima() {
        return hitungGaji() - hitungPajak();
    }
	public void printInfo() {
        System.out.println("Nama 		: "+getNama());
        System.out.println("NIP 		: "+getNIP());
        System.out.println("Alamat 		: "+getAlamat());
		System.out.println("Gaji Kotor	: "+hitungGaji());
		System.out.println("Pajak		: "+hitungPajak());
        System.out.println("Gaji Bersih 	: "+hitungTotalTerima()+"\n\nGaji Bersih = Gaji Kotor - Pajak");
		
    }
}
