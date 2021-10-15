class prisma extends segiempat{
	private int tinggi;
	public prisma(){
		super();
		this.tinggi=11;
	}
	public prisma(int p, int l, int t){
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
	public double tinggialas(){
		return(Math.sqrt(Math.pow(getPanjang(),2)-Math.pow(0.5*getLebar(),2)));
	}
	public double hitungvolume(){
		return 0.5*super.hitungluas()*this.tinggi;
	}
	public double hitungluaspermukaan(){
		return 2*0.5*getLebar()*tinggialas()+3*super.hitungluas();
	}
}