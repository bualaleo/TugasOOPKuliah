public class MahasiswaS1 extends Mahasiswa{
	private String programStudiS1;
	public MahasiswaS1(){
		this.programStudiS1="";
	}
	public MahasiswaS1(String nama, int nim, String programStudiS1){
		super(nama,nim);
		this.programStudiS1=programStudiS1;
	}
	public String getProgramStudiS1(){
		return this.programStudiS1;
	}
	public void setProgramStudiS1(String a){
		this.programStudiS1=a;
	}
	public void printInfo(){
		super.printInfo();
		System.out.println("Program Studi S1 : "+programStudiS1);
	}
}
