public class Segiempat{
	private Titik topLeft;
	private Titik bottomRight;	
	public Segiempat(){} 
	public Segiempat(Titik a, Titik b){topLeft=a; bottomRight=b;} 
	public Titik getTopLeft(){return topLeft;}
	public void setTopLeft(Titik topLeft){this.topLeft=topLeft;}
	public Titik getBottomRight(){return bottomRight;}
	public void setBottomRight(Titik bottomRight){this.bottomRight=bottomRight;}
	public void printInfo(){
		System.out.println("panjang =   "+topLeft);
		System.out.println("lebar 	= 	"+bottomRight);
	}
	public double hitungPanjang(){
	    return Math.pow((bottomRight.getX()-topLeft.getX()),2);
	}	
	public double hitungLebar(){
        return Math.pow((bottomRight.getY()-topLeft.getY()),2);
	}	
	public double getLuasSegiempat(){
		return hitungPanjang()*hitungLebar();
	}
	public double getKelilingSegiempat(){
		return (2*hitungPanjang())+(2*hitungLebar());
	}
	public void translasi(int dx, int dy){
		topLeft.translasi(dx,dy);
		bottomRight.translasi(dx,dy);
	}	
	public void mirrorSbX(){
		topLeft.mirrorSbX();
		bottomRight.mirrorSbX();	
	}	
	public void mirrorSbY(){
		topLeft.mirrorSbY();
		bottomRight.mirrorSbY();
	}
} 