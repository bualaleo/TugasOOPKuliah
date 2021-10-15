class kerucut extends lingkaran{
	private double tinggi;
	public kerucut(){
		super();
		tinggi=6;
	}
	public kerucut(double r, double t){
		super(r);
		this.tinggi=tinggi;
	}
	public double getTinggi(){
		return this.tinggi;
	}
	public void printInfo(){
		super.printInfo();
		System.out.println("TInggi : "+getTinggi());
	}
	public double hitungvolume(){
		return 0.3333*super.hitungluas()*tinggi;
	}
	public double hitungluas(){
		double s = Math.pow(getRadius(),2)+Math.pow(getTinggi(),2);
		return(super.hitungluas()+(getRadius()*getPi()*Math.sqrt(s)));
	}
}