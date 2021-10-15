class  Borrow extends Akun0009{
	private int value;
	private int totalCicilan;
	public Borrow(String nama, int id, int value, int cicilan){
	super(id, nama);
	value=0;
	cicilan=0;
}
	public void hitungSisa(int cicilan){
	this.totalCicilan=this.totalCicilan-cicilan;
}
	public int getValue(){return value;}
	public int getCicilan(){return totalCicilan;}
	public void setValue(int value){this.value = value;}
	public void setCicilan(int cicilan){totalCicilan=cicilan;}

}