class Transaksi{
	private int jumlah;
	private boolean isKredit;
	public Transaksi(){
	jumlah=0;
	isKredit=false;
}
	public Transaksi(int jumlah,boolean kredit){
	this.jumlah=jumlah;
	isKredit=kredit;
}
	public void setJumlah(int jumlah){this.jumlah=jumlah;}
	public void setKredit(boolean kredit){isKredit=kredit;}
	public int getJumlah(){return jumlah;}
	public boolean getKredit(){return isKredit;}
}