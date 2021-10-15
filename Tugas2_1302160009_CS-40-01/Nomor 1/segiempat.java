class segiempat{
	private int panjang;
	private int lebar;
	public segiempat(){
		this.panjang=10;
		this.lebar=4;
	}
	public segiempat(int p, int l){
		this.panjang=p;
		this.lebar=l;
	}
	public int getPanjang(){
		return panjang;
	}
	public void setPanjang(int p){
		this.panjang=p;
	}
	public int getLebar(){
		return lebar;
	}
	public void setLebar(int l){
		this.lebar=l;
	}
	public void printInfo(){
		System.out.println("Panjang : "+getPanjang());
		System.out.println("Lebar : "+getLebar());
	}
	public int hitungluas(){
		return this.panjang*this.lebar;
	}
	public int hitungkeliling(){
		return 2*(this.panjang+this.lebar);
	}
}