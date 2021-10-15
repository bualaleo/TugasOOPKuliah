class lingkaran{
	private double radius;
	private static final double pi = 3.142312;
	public lingkaran(){
		radius=9;
	}
	public lingkaran(double r){
		radius=r;
	}
	public double getRadius(){
		return radius;
	}
	public double getPi(){
		return pi;
	}
	public void setRadius(float r){
		radius=r;
	}
	public void printInfo(){
		System.out.println("Radius : "+getRadius());
		System.out.println("Phi : "+getPi());
	}
	public double hitungluas(){
		return pi*radius*radius;
	}
	public double hitungkeliling(){
		return 2*pi*radius;
	}
}