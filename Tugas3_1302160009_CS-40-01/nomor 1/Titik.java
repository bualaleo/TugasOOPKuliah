public class Titik{
	private int x;
	private int y;
	public Titik(){x=0; y=0;}
	public Titik( int tx, int ty){x=tx; y=ty;}
	public int getX(){return x;}
	public int getY(){return y;}
	public void setX(int x){this.x = x;}
	public void setY(int y){this.y=y;}
	public String toString(){
		return ("Titik : "+x+" , " + " "+y);
	}
	public void printInfo(){
		System.out.println(this);
	}
	public double hitungjarakOrigin(){
		return Math.sqrt(x*x +y*y);
	}
	public void translasi(int dx,int dy){
		x+=dx;y+=dy;
		System.out.println("Translasi : "+x+" , " + " "+y);
	}
	public void rotasi(double angle){
		double hasilx,hasily;
		hasilx= ((x * Math.cos(Math.toRadians(angle))) - (y * Math.sin(Math.toRadians(angle))));
		hasily= ((x * Math.sin(Math.toRadians(angle))) + (y * Math.cos(Math.toRadians(angle))));
		System.out.print(" Rotasi :"+hasilx +" , " + " "+hasily);
		System.out.println();
	}
	public void dilatasi(int skala){
		int hasilx,hasily;
		hasilx = skala * x ;
		hasily=skala *y;
		System.out.print("Dilatasi : "+hasilx +" , " + " "+hasily);
		System.out.println();
	}
	public void mirrorSbX(){
		int a ;
		a= y *-1;
		System.out.print("Refleksi terhadap X : "+x+","+" "+a);
		System.out.println();
	}
	public void mirrorSbY(){
		int a;
		a = x *-1;
		System.out.print("Refleksi terhadap Y  : "+a+","+" "+y);
	}
}