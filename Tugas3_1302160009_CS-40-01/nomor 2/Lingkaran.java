public class Lingkaran{
	private double radius;
	final double pi=3.14;
	private Titik center;
	public Lingkaran(){radius=0;} 
	public Lingkaran(double r, Titik center){radius=r; this.center=center;}
	public double getRadius(){return radius;}	
	public Titik getCenter(){return center;}
	public void setRadius(double radius){this.radius = radius;}	
	public void setCenter(Titik center){this.center = center;}
	public String toString(){
		return("Radius: "+radius);
	}
	public void printInfo(){
		System.out.println(this);
		System.out.println(center);
	}	
	public double luasLingkaran(){
		return pi * radius *radius;
	}
	public double getLuasLingkaran(){
		return 2 * pi *radius;
	}
	public void translasi(int dx,int dy){
		center.translasi(dx,dy);
	}
	public void mirrorSbX(){
		center.mirrorSbX();
	}
	public void mirrorSbY(){
		center.mirrorSbY();
	}
	public boolean cekTitikInner(int x,int y){
		if (center.hitungjarakOrigin()<=luasLingkaran()){
			return true;
		}else {
			return false;
		}
	}

} 