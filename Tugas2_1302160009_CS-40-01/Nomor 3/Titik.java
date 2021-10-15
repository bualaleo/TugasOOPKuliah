class Titik{
	private double  x;
	private double y;
	public Titik() {
		x = 0.0;
		y = 0.0;
	}
	public Titik(double tx, double ty){
		x = tx;
		y = ty;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void setX(double tx){
		x = tx;
	}
	public void setY(double ty){
		y = ty;
	}
	public void printInfo(){
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
	public double hitungJarakOrigin(){
	return Math.sqrt(Math.pow(getX(),2) + Math.pow(getY(),2));
	}
	public int hitungKuadran(){
		if ((getX()>0 && getY()>0)) {
			 return 1;
		}
		else if((getX()<0 && getY()>0)) {
			return 2;
		}
		else if((getX()<0 && getY()<0)) {
			return 3;
		}else {
			return 4;
		}
	}
	public void Translasi(int dx, int dy) {
		double translasiX = x + dx;
		double translasiY = y + dy;
		System.out.println("Translasi X : " + translasiX);
		System.out.println("Translasi Y : " + translasiY);
		System.out.println(" ");
	}
	public void rotasi(double angle){
		double rotasiX , rotasiY;
		System.out.println("Rotasi");
		rotasiX = getX()*Math.cos(angle) - getY()*Math.sin(angle);
		rotasiY = getX()*Math.sin(angle) + getY()*Math.cos(angle);
		System.out.println("rotasi X = "+ rotasiX);
		System.out.println("rotasi Y = "+ rotasiY);
		System.out.println(" ");
	}
	public void dilatasi(int skala){
		System.out.println("Dilatasi");
		System.out.println("skala = 2");
		double hasilX, hasilY;
		hasilX = skala*getX();
		hasilY = skala*getY();
		System.out.println("dilatasi X = " +hasilX);
		System.out.println("dilatasi Y = " +hasilY);
		System.out.println(" ");
	}
	public void mirrorSbX(){
		double mirrorX = -getX();
		System.out.println("Mirror");
		System.out.println("Mirror sumbu X ="+ mirrorX);
	}
	public void mirrorSbY(){
		double mirrorY = -getY();
		System.out.println("Mirror Sumbu Y ="+ mirrorY);
		System.out.println(" ");
	}
	
}
			
		
	