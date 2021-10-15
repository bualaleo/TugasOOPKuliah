public class Garis{
	private Titik tAwal;
	private Titik tAkhir;
	public Garis(){}
	public Garis( Titik tAwal,Titik tAkhir){
		this.tAwal= tAwal; this.tAkhir=tAkhir;
	}
	public Titik getAwal(){return tAwal;}
	public Titik getAkhir(){return tAkhir;}
	public void setAwal(Titik tAwal){this.tAwal=tAwal;}
	public void setAkhir(Titik tAkhir){this.tAkhir=tAkhir;}
	public String toString(){
		return("Titik : "+tAwal+" , " + " "+tAkhir);
	}
	public void printInfo(){
		System.out.println(this);
	}
	public void translasi(int dx,int dy){
		tAwal.translasi(dx,dy);
		tAkhir.translasi(dx,dy);
	}
	public double hitungPanjang(){
		double x = tAkhir.getX()-tAwal.getX();
        double y = tAkhir.getY()-tAwal.getY();
		return Math.sqrt(x*x +y*y);
	}
	public double hitungGradien(){
        float y = tAkhir.getY()-tAwal.getY();
		float x = tAkhir.getX()-tAwal.getX();
		return y/x;
	}
	public Titik cariTitikTengah(){
		int x = (tAwal.getX()+tAkhir.getX())/2;
		int y = (tAkhir.getY()+tAwal.getY())/2;
		return new Titik(x,y);
	}
	public void rotasi(double angle){
		tAwal.rotasi(angle);
		tAkhir.rotasi(angle);
	}
	public void dilatasi(int skala){
		tAwal.dilatasi(skala);
		tAkhir.dilatasi(skala);
	}
	public void mirrorSBX(){
		tAwal.mirrorSbX();	
	}
	public void mirrorSBY(){
		tAkhir.mirrorSbY();
	}
	public float intersectSBX(){
		return (tAwal.getX()*tAwal.getY())/tAwal.getX();
	}
	public float intersectSBY(){
		return (tAkhir.getX()*tAkhir.getY())/tAkhir.getY();
	}
}