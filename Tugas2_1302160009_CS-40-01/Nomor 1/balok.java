class balok extends segiempat{
	private int tinggi;
	public balok(){
		super();
		this.tinggi=6;
	}
	public balok(int p, int l, int t){
		super(p,l);
		this.tinggi=tinggi;
	}
	public int getTinggi(){
		return this.tinggi;
	}
	public void setTinggi(int t){
		this.tinggi=t;
	}
	public void printInfo(){
		super.printInfo();
		System.out.println("Tinggi : "+getTinggi());
	}
	public int hitungvolume(){
		return super.hitungluas()*this.tinggi;
	}
	public int hitungluaspermukaan(){
		return 2*super.hitungluas()+2*getPanjang()*this.tinggi+2*getLebar()*this.tinggi;
	}
}