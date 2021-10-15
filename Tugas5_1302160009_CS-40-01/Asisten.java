public class Asisten extends Person implements InterfaceMahasiswa,InterfaceDosen{
    private double IPK;
    private int TotalJam;

    public Asisten() {
    }
    public Asisten(double IPK, int TotalJam, String nama, String alamat) {
        super(nama, alamat);
        this.IPK = IPK;
        this.TotalJam = TotalJam;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public int getTotalJam() {
        return TotalJam;
    }

    public void setTotalJam(int TotalJam) {
        this.TotalJam = TotalJam;
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
    public double hitungGaji() {
        return TotalJam * honor;
    }
    public double hitungPajak(){
        double Gaji = hitungGaji();
        if(Gaji >= 1000000){
            return Gaji * 0.25;
        }
        else if((Gaji < 1000000)&&( Gaji > 500000)){
            return Gaji * 0.15;
        }else{
            return Gaji * 0.05;
        }
    }
    public double hitungTotalTerima() {
        return hitungGaji() - hitungPajak() + hitungBeasiswa();
    }
	public void printInfo(){
        System.out.println("Nama		: "+getNama());
        System.out.println("Alamat 		: "+getAlamat());   
        System.out.println("IPK 		: "+getIPK());
		System.out.println("Gaji Kotor	: "+hitungGaji());
		System.out.println("Pajak		: "+hitungPajak());
        System.out.println("Beasiswa 	: "+hitungBeasiswa());
        System.out.println("Total Gaji	: "+hitungTotalTerima()+"\n\nTotal Gaji = (Gaji Kotor + Beasiswa) - Pajak");
    }
}
