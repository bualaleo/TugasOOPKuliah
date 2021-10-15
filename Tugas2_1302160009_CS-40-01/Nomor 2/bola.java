class bola extends lingkaran{
	public bola(){
		super();
	}
	public bola(double r){
		super(r);
	}
	public void printInfo(){
		super.printInfo();
	}
	public double hitungluas(){
		return(super.hitungluas()*4);
	}
	public double hitungvolume(){
		return(1.3333*super.hitungluas()*super.getRadius());
	}
}