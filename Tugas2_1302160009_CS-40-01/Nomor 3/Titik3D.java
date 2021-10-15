class Titik3D extends Titik {
	private double z;
	public Titik3D(){
		super();
		z=0.0;
	}
	public Titik3D(double tx,double ty,double tz){
		super(tx,ty);
		this.z = tz;
	}
	public double getZ(){
		return z;
	}
	public void setZ(double tz){
		tz = z;
	}	
	public void printInfo(){
		super.printInfo();
		System.out.println("Z : " +z);
	}
	public double hitungJarakOrigin(){
		return super.hitungJarakOrigin() + Math.pow(getZ(),2);
	}
	public int hitungKuadran(){
		int k;
		if ( z > 0){
			k = super.hitungKuadran();
		}else{
			k = super.hitungKuadran() + 4;
		}
		return k;
	}
	public void translasi(int dx, int dy, int dz){
		double translasiX, translasiY, translasiZ;
		super.Translasi(dx,dy);
		translasiZ = z + dz;
		System.out.println("Translasi Y : "  + translasiZ);
	}
	public void mirrorSbX(){
		super.mirrorSbX();
	}
	public void mirrorSbY(){
		super.mirrorSbY();
	}
	public void mirrorSbZ(){
		double mirrorZ = -getZ();
		System.out.println("Mirror Sumbu Z = "+mirrorZ);
	}
}