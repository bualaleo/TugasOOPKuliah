class Saving extends Akun0009{
	private int saldo;
	private Transaksi arrTransaksi[100];
	public Saving(){saldo=0;}
	public Saving(int saldo){this.saldo=saldo;}
	public Saving(String nama, int no, int saldo){
	super(no,nama);
	this.saldo=saldo;
}
	public int getSaldo(){return saldo;}
	private void updateSaldo(int saldo){
	this.saldo=this.saldo+saldo;
}
	public void addSetoran(){}
	public void info(){
	super.info();
	System.out.println("Saldo = "+saldo);
	}
}